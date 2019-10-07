package com.trifulcas.springprueba;

public class Saludos  {

	private ISaludo _saludo;
	public Saludos(ISaludo miSaludo) {
		_saludo=miSaludo;
	}
	public String hola() {
		return _saludo.hola();
	}
	public String adios() {
		return _saludo.adios();
	}
	
}
