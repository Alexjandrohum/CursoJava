package spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import spring.domain.Doctor;
import spring.domain.HorarioContent;
import spring.service.DoctorService;
import spring.util.BaseDate;

@Repository
public class DoctorDaos implements DoctorService {

	private DataSource dataSource;
	private BaseDate j = new BaseDate();

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Bean
	public DataSource dataSource() {
		return j.dataSource();
	}

	@Override
	public boolean createDoctor(Doctor doctor) {
		String sql = "INSERT INTO doctor(nombre, apellidos, direccion, telefono, rfc, especialidad, sexo, correo, contra) "
				+ "VALUES(?,?,?,?,?,?,?,?,?)";
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
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
			System.out.println("SQLException: " + e.getMessage());
			return false;

		}
	}

	@Override
	public Doctor getDoctorByEmail(String email) {
		Doctor doctor = null;
		String sql = "SELECT id_doctor, nombre, apellidos, direccion, telefono, rfc, especialidad, sexo, correo, contra FROM doctor WHERE correo=?";
		Connection conn = null;
		try {
			// String[] key = {"id_doctor"};
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();

			ps.getGeneratedKeys();
			if (rs.next()) {
				doctor = new Doctor(rs.getInt("id_doctor"), rs.getString("nombre"), rs.getString("apellidos"),
						rs.getString("direccion"), rs.getString("telefono"), rs.getString("rfc"),
						rs.getString("especialidad"), rs.getString("sexo"), rs.getString("correo"),
						rs.getString("contra"));
			}

			return doctor;

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public int createHorario() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean createHorario(HorarioContent horario, int id) {
		System.out.println("Horario: " + horario + " ID " + id);
		int i = createAgenda(horario.getSemana(), id);
		System.out.println("Id generado: " + i);
		if (i != 0) {

			if (horario.getInicioL() > 0 && horario.getTerminoL() > 0) {
				crearDiasHorario(horario.getInicioL(), horario.getTerminoL(), i, horario.getDiaLunes());
			}
			if (horario.getInicioM() > 0 && horario.getTerminoM() > 0) {
				crearDiasHorario(horario.getInicioM(), horario.getTerminoM(), i, horario.getDiaMartes());
			}
			if (horario.getInicioMie() > 0 && horario.getTerminoMie() > 0) {
				crearDiasHorario(horario.getInicioMie(), horario.getTerminoMie(), i, horario.getDiaMiercoles());
			}
			if (horario.getInicioJ() > 0 && horario.getTerminoJ() > 0) {
				crearDiasHorario(horario.getInicioJ(), horario.getTerminoJ(), i, horario.getDiaJueves());
			}
			if (horario.getInicioV() > 0 && horario.getTerminoV() > 0) {
				crearDiasHorario(horario.getInicioV(), horario.getTerminoV(), i, horario.getDiaviernes());
			}

		}
		return true;
	}

	private void crearDiasHorario(int horaInicio, int horaTermino, int id_agenda, String dia) {
		System.out.println(
				"Inicio: " + horaInicio + "Termino: " + horaTermino + " Agenda: " + id_agenda + " dia: " + dia);
		String sql = "INSERT INTO horario(hora_inicio, hora_termino, id_agenda, dia) VALUES(?,?,?,?)";
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, horaInicio);
			ps.setInt(2, horaTermino);
			ps.setInt(3, id_agenda);
			ps.setString(4, dia);
			ps.executeUpdate();
			ps.close();
			System.out.print("Hoario Creado");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	int createAgenda(String semana, int id) {

		String sql = "INSERT INTO agenda(no_semana, id_doctor) VALUES(?,?)";
		Connection conn = null;
		try {
			conn = dataSource.getConnection();

			int valor = selectSemanaExist(semana);
			if (valor != 0) {
				return 0;
			}
			System.out.println("Valor: " + valor);
			String[] key = { "id_agenda" };
			PreparedStatement ps = conn.prepareStatement(sql, key);

			ps.setInt(1, Integer.parseInt(semana));
			ps.setInt(2, id);
			ps.executeUpdate();
			ResultSet generatedKey = ps.getGeneratedKeys();
			generatedKey.next();
			int idGenerated = generatedKey.getInt(1);

			ps.close();
			return idGenerated;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return 0;
		}

	}

	int selectSemanaExist(String id) {

		String sql = "select no_semana from agenda where no_semana =?";
		Connection conn = null;
		int idSemana = 0;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, Integer.parseInt(id));
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				idSemana = rs.getInt("no_semana");
			}

			return idSemana;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}

	}

}
