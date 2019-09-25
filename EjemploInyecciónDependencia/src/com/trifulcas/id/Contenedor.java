package com.trifulcas.id;

public class Contenedor {

	ISaludo saludador;
	
	public Contenedor(ISaludo saludador) {
		this.saludador=saludador;
	}
	
	public void saludar() {
		saludador.Saludo();
	}
}
