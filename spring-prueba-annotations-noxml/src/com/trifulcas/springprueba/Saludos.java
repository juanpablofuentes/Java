package com.trifulcas.springprueba;

import org.springframework.stereotype.Component;

@Component("miSaludo")
public class Saludos implements ISaludo {

	public String hola() {
		return "Hola que tal";
	}
	public String adios() {
		return "Adios que te vaya bien";
	}
	
}
