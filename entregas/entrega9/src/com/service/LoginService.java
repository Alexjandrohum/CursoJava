package com.service;

import comconf.Doctor;

public interface LoginService {

	Doctor validarDoctor(String usuario, String pass);

}
