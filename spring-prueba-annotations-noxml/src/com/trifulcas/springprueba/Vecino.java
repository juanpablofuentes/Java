package com.trifulcas.springprueba;

import org.springframework.stereotype.Component;

@Component
public class Vecino implements ISaludo {

	@Override
	public String hola() {
		// TODO Auto-generated method stub
		return "Holi vecinito";
	}

	@Override
	public String adios() {
		// TODO Auto-generated method stub
		return "Hasta luegi!!";
	}

}
