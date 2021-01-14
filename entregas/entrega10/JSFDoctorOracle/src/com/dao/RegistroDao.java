package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.domain.Doctor;
import com.service.RegistroService;

public class RegistroDao implements RegistroService {

	private DataSource dataSource;

	public RegistroDao() {
		dataSource = null;
		try {
			Context ctx = new InitialContext();
			dataSource = (DataSource) ctx.lookup("java:comp/env/jdbc/oracle");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean createDoctor(Doctor doctor) {
		String sql = "INSERT INTO doctor (id_doctor, nombre, apellidos, direccion, telefono, rfc, especialidad, sexo, correo, contra"
				+ ") VALUES (seq_doc.NEXTVAL,?,?,?,?,?,?,?,?,?)";

		Connection conn = null;
		try {
			conn = dataSource.getConnection();

			if (conn == null) {
				throw new SQLException("No se puede obtener la conexion a la base de datos");
			}
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, doctor.getNombre());
			ps.setString(2, doctor.getApellidos());
			ps.setString(3, doctor.getDireccion());
			ps.setString(4, doctor.getTelefono());
			ps.setString(5, doctor.getRfc());
			ps.setString(6, doctor.getEspecialidad());
			ps.setString(7, doctor.getSexo());
			ps.setString(8, doctor.getCorreo());
			ps.setString(9, doctor.getContra());
			ps.executeUpdate();
			ps.close();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
