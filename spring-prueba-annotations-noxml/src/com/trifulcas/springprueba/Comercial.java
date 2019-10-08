package com.trifulcas.springprueba;

import org.springframework.stereotype.Component;

@Component
public class Comercial implements IPresentacion {

	private ISaludo _saludo;

	public Comercial(ISaludo saludo) {
		_saludo = saludo;
	}

	@Override
	public String presentacion() {

		return _saludo.hola()+" soy el comercial. ¿Quiere comprar algo?";
	}

}
