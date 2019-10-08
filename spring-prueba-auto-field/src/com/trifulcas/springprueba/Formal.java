package com.trifulcas.springprueba;

import org.springframework.stereotype.Component;

@Component
public class Formal implements ISaludo {

	@Override
	public String hola() {
		// TODO Auto-generated method stub
		return "Tengan todos ustedes muy buenos días";
	}

	@Override
	public String adios() {
		// TODO Auto-generated method stub
		return "Con la venia me despido";
	}

}
