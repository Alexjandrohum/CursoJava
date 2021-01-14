package com.apress.springrecipes.court.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.apress.springrecipes.court.domain.Credenciales;
import com.apress.springrecipes.court.domain.Doctor;
import com.apress.springrecipes.court.domain.DoctorDTO;
import com.apress.springrecipes.court.domain.HorarioContent;
import com.apress.springrecipes.court.domain.Itinerario;
import com.apress.springrecipes.court.service.DoctorService;
import com.apress.springrecipes.court.util.Constantes;

public class DoctorDao implements DoctorService {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
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
			System.out.println("Errror");
			return false;

		}
	}

	@Override
	public DoctorDTO getValidation(Credenciales credenciales) {
		DoctorDTO doctor = null;
		String sql = "SELECT id_doctor, nombre, apellidos, direccion, telefono, rfc, especialidad, sexo, correo, contra FROM doctor WHERE correo=? and contra=?";
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, credenciales.getUsuario());
			ps.setString(2, credenciales.getPassword());
			
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				doctor = new DoctorDTO(rs.getInt("id_doctor"), rs.getString("nombre"), rs.getString("apellidos"),
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
	public int createHorario(HorarioContent horario, int idDoctor) {
		int it = 0;
		Itinerario itinerario;
		String seman = horario.getSemana();
		itinerario = getValidacionSemana(seman, idDoctor);
		System.out.println("Ite: " + itinerario);

		if (itinerario == null) {
			if (getValidacionDias(horario) == Constantes.validacionDiasCorrecto) {
				return saveHorario(horario, idDoctor);
			} else {
				return getValidacionDias(horario);
			}
		} else {
			return Constantes.semanaOcupada;
		}

	}

	private int getValidacionDias(HorarioContent horario) {
		if ((horario.getInicioL() > 0 && horario.getTerminoL() > 0)
				|| (horario.getInicioM() > 0 && horario.getTerminoM() > 0)
				|| (horario.getInicioMie() > 0 && horario.getTerminoMie() > 0)
				|| (horario.getInicioJ() > 0 && horario.getTerminoJ() > 0)
				|| (horario.getInicioV() > 0 && horario.getTerminoV() > 0)) {

			return Constantes.validacionDiasCorrecto;

		} else {
			return Constantes.diaNecesario;
		}

	}

	private int saveHorario(HorarioContent horario, int idDoctor) {
		String sql = "insert into itinerario(no_semana, inicioL, terminoL, diaLunes, inicioM, terminoM, diaMartes, inicioMie, terminoMie, diaMiercoles, inicioJ, terminoJ, diaJueves, inicioV, terminoV, diaViernes, id_doctor) "
				+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, Integer.parseInt(horario.getSemana()));
			ps.setInt(2, horario.getInicioL());
			ps.setInt(3, horario.getTerminoL());
			ps.setString(4, horario.getDiaLunes());
			ps.setInt(5, horario.getInicioM());
			ps.setInt(6, horario.getTerminoM());
			ps.setString(7, horario.getDiaMartes());
			ps.setInt(8, horario.getInicioMie());
			ps.setInt(9, horario.getTerminoMie());
			ps.setString(10, horario.getDiaMiercoles());
			ps.setInt(11, horario.getInicioJ());
			ps.setInt(12, horario.getTerminoJ());
			ps.setString(13, horario.getDiaJueves());
			ps.setInt(14, horario.getInicioV());
			ps.setInt(15, horario.getTerminoV());
			ps.setString(16, horario.getDiaviernes());
			ps.setInt(17, idDoctor);
			ps.executeUpdate();
			ps.close();
			return Constantes.saveHorario;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return Constantes.errorSaveHorario;
		}

	}

	Itinerario getValidacionSemana(String semana, int idDoctor) {
		String sql = "select id_itinerario, no_semana, inicioL, terminoL, diaLunes, inicioM, terminoM, diaMartes, inicioMie, terminoMie, diaMiercoles, inicioJ, terminoJ, diaJueves, inicioV, terminoV, diaViernes, id_doctor FROM itinerario where no_semana=? and id_doctor=?";
		Connection conn = null;
		int valor = 0;
		Itinerario itinerario = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, Integer.parseInt(semana));
			ps.setInt(2, idDoctor);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				itinerario = new Itinerario(rs.getInt("id_itinerario"), rs.getInt("no_semana"), rs.getInt("inicioL"),
						rs.getInt("terminoL"), rs.getString("diaLunes"), rs.getInt("inicioM"), rs.getInt("terminoM"),
						rs.getString("diaMartes"), rs.getInt("inicioMie"), rs.getInt("terminoMie"),
						rs.getString("diaMiercoles"), rs.getInt("inicioJ"), rs.getInt("terminoJ"),
						rs.getString("diaJueves"), rs.getInt("inicioV"), rs.getInt("terminoV"),
						rs.getString("diaViernes"), rs.getInt("id_doctor"));
				System.out.println("yaaa: " + itinerario);
			}
			// System.out.println("IdItinerario: " + rs.getInt("id_itinerario"));
			// valor = rs.getInt("id_itinerario");

			return itinerario;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
