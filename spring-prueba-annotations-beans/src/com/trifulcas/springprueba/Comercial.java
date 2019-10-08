package com.trifulcas.springprueba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Comercial implements IPresentacion {

	private ISaludo _saludo;

	@Autowired
	public Comercial(@Qualifier("formal") ISaludo saludo) {
		_saludo = saludo;
	}

	@Override
	public String presentacion() {

		return _saludo.hola()+" soy el comercial. ¿Quiere comprar algo?";
	}

}
