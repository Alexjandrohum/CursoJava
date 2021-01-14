package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import domain.Cliente;
import domain.Direccion;
import domain.Registro;
import service.DireccionService;
import util.ConfDb;

public class DireccionDao implements DireccionService {

	private DataSource dataSource;

	public DireccionDao() {
		dataSource = null;
		try {
			Context ctx = new InitialContext();
			dataSource = (DataSource) ctx.lookup("java:comp/env/jdbc/oracle");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	public List<Direccion> getDirecciones() {

		List<Direccion> direcciones = new ArrayList<Direccion>();
		String sql = "call sp_getDireccionById(?, ?, ?, ?, ?, ?)";
		Connection conn = null;
		CallableStatement cs = null;
		try {
			conn = dataSource.getConnection();

			cs = conn.prepareCall(sql);

			cs.setInt(1, java.sql.Types.INTEGER);
			cs.setInt(2, java.sql.Types.VARCHAR);
			cs.setInt(3, java.sql.Types.VARCHAR);
			cs.setInt(4, java.sql.Types.VARCHAR);
			cs.setInt(5, java.sql.Types.INTEGER);
			cs.setInt(6, java.sql.Types.INTEGER);

			ResultSet rs = cs.executeQuery();

			while (rs.next()) {
				direcciones.add(new Direccion(rs.getInt("FINUMERO"), rs.getString("FCCALLE"), rs.getString("FCCOLONIA"),
						rs.getString("FCESTADO"), rs.getInt("FICODIGOPOSTAL"), rs.getInt("FIESTADODOMICILIO")));
			}
			return direcciones;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public Direccion getDireccionById(int id) {
		Direccion direccion = null;
		String sql = "SELECT FINUMERO, FCCALLE, FCCOLONIA, FCESTADO, FICODIGOPOSTAL, FIESTADODOMICILIO FROM tadomicilio WHERE FINUMERO = ?";
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				direccion = new Direccion(rs.getInt("FINUMERO"), rs.getString("FCCALLE"), rs.getString("FCCOLONIA"),
						rs.getString("FCESTADO"), rs.getInt("FICODIGOPOSTAL"), rs.getInt("FIESTADODOMICILIO"));
			}
			return direccion;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int crearDireccion(Direccion direccion) {
		System.out.println("Obtrnido: " + direccion);
		String sql = "insert into tadomicilio(FINUMERO,FCCALLE,FCCOLONIA,FCESTADO,FICODIGOPOSTAL,FIESTADODOMICILIO) values(SEQ_IDIRECCION.nextval,?,?,?,?,?);";
		Connection conn = null;
		int creado = 0;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, direccion.getFccalle());
			ps.setString(2, direccion.getFccolonia());
			ps.setString(3, direccion.getFcestado());
			ps.setInt(4, direccion.getFicodigopostal());
			ps.setInt(5, direccion.getFiestadodomicilio());
			ps.executeUpdate();
			ps.close();
			return 1;
		} catch (SQLException e) {
			e.printStackTrace();
			return creado;
		}

	}

	@Override
	public void crearCliente(Registro registro) {
		Connection conn = null;
		System.out.println("Registro: " + registro);
		try {
			conn = dataSource.getConnection();
			CallableStatement cs3 = null;
			cs3 = conn.prepareCall("call sp_createCliente2(?,?,?,?,?,?,?,?,?,?,?,?,?)");
			cs3.setString(1, registro.getNombre());
			cs3.setDate(2, Date.valueOf(registro.getNacimiento()));
			cs3.setString(3, registro.getRfc());

			cs3.setInt(4, registro.getDomicilio());
			cs3.setInt(5, registro.getEstado());
			cs3.setInt(6, registro.getBanco());

			cs3.setString(7, registro.getApellidos());
			cs3.setString(8, registro.getSexo());

			cs3.setString(9, registro.getCalle());
			cs3.setString(10, registro.getColonia());

			cs3.setString(11, registro.getEstadodireccion());
			cs3.setInt(12, registro.getPostal());
			cs3.setInt(13, registro.getEstadodomicilio());
			cs3.execute();
		} catch (SQLException e) {
			System.out.println("Error de sql : " + e);
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println("Error de sql : " + e);
			}
		}

	}

	@Override
	public Cliente obtenerCliente(int id) {
		Cliente cliente = null;
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			CallableStatement cs = null;
			cs = conn.prepareCall("call sp_getCliente2(?, ?, ?, ?, ?, ?, ?, ?, ?)");

			cs.setInt(1, id);

			cs.registerOutParameter(1, java.sql.Types.INTEGER);
			cs.registerOutParameter(2, java.sql.Types.VARCHAR);
			cs.registerOutParameter(3, java.sql.Types.DATE);
			cs.registerOutParameter(4, java.sql.Types.VARCHAR);
			cs.registerOutParameter(5, java.sql.Types.INTEGER);
			cs.registerOutParameter(6, java.sql.Types.INTEGER);
			cs.registerOutParameter(7, java.sql.Types.INTEGER);
			cs.registerOutParameter(8, java.sql.Types.VARCHAR);
			cs.registerOutParameter(9, java.sql.Types.VARCHAR);

			cs.execute();

			cliente = new Cliente(cs.getInt(1), cs.getString(2), cs.getDate(3).toString(), cs.getString(4),
					cs.getInt(5), cs.getInt(6), cs.getInt(7), cs.getString(8), cs.getString(9));
		} catch (SQLException e) {
			System.out.println("Error de sql : " + e);
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println("Error de sql : " + e);
			}
		}

		return cliente;

	}

	@Override
	public int deteleCliente(int id) {
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			CallableStatement cs = null;
			cs = conn.prepareCall("call sp_deleteCiente(?)");

			cs.setInt(1, id);

			cs.execute();

			return 1;
		} catch (SQLException e) {
			System.out.println("Error de sql : " + e);
			return 0;
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println("Error de sql : " + e);
			}
		}

	}

}
