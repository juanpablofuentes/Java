package com.trifulcas.springprueba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("miSaludo")
public class Saludos {

	@Autowired
	@Qualifier("formal")
	private ISaludo _saludo;
	
	public String hola() {
		return _saludo.hola();
	}
	public String adios() {
		return _saludo.adios();
	}
	
}
