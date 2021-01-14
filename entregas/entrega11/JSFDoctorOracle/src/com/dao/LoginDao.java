package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.domain.Doctor;
import com.service.LoginService;

public class LoginDao implements LoginService {

	private DataSource dataSource;

	public LoginDao() {
		dataSource = null;
		try {
			Context ctx = new InitialContext();
			dataSource = (DataSource) ctx.lookup("java:comp/env/jdbc/oracle");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Doctor login(String usuario, String contra) {
		String sql = "SELECT id_doctor, nombre, apellidos, direccion, telefono, rfc, especialidad, sexo, correo, contra FROM doctor WHERE correo=? and contra=?";
		Doctor doctor = null;
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, usuario);
			ps.setString(2, contra);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				doctor = new Doctor(rs.getInt("id_doctor"), rs.getString("nombre"), rs.getString("apellidos"),
						rs.getString("direccion"), rs.getString("telefono"), rs.getString("rfc"),
						rs.getString("especialidad"), rs.getString("sexo"), rs.getString("correo"),
						rs.getString("contra"));
			}

			return doctor;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

}
