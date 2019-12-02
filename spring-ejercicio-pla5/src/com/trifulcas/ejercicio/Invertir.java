package com.trifulcas.ejercicio;

public class Invertir implements ICodificacion {

	@Override
	public String codificar(String cadena) {
		return new StringBuilder(cadena).reverse().toString();
	}

	@Override
	public String decodificar(String cadena) {
		
		return codificar(cadena);
	}
	

}
