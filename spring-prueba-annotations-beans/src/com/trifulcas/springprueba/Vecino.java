package com.trifulcas.springprueba;

import org.springframework.stereotype.Component;

@Component
public class Vecino implements IPresentacion {

	private ISaludo _saludo;

	public Vecino(ISaludo saludo) {
		_saludo = saludo;
	}

	@Override
	public String presentacion() {

		return _saludo.hola()+" soy el vecino.";
	}

}
