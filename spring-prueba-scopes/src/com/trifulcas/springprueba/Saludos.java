package com.trifulcas.springprueba;

public class Saludos  {

	private ISaludo _saludo;
	
	public void setSaludo(ISaludo miSaludo) {
		_saludo=miSaludo;
	}
	public String hola() {
		return _saludo.hola();
	}
	public String adios() {
		return _saludo.adios();
	}
	
	public void iniciar() {
		System.out.println("Estamos iniciando la clase");
	}
	public void finalizar() {
		System.out.println("Estamos finalizando la clase");
	}
}
