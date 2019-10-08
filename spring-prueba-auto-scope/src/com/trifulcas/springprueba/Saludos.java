package com.trifulcas.springprueba;



import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("miSaludo")
@Scope("prototype")
public class Saludos {

	@Autowired
	@Qualifier("formal")
	private ISaludo _saludo;
	
	public Saludos() {
		System.out.println("Constructor");
	}
	public String hola() {
		return _saludo.hola();
	}
	public String adios() {
		return _saludo.adios();
	}
	@PostConstruct
	public void creacion() {
		System.out.println("Esto se ejecuta después de construirse el objeto");
	}
	
	@PreDestroy
	public void destruccion() {
		System.out.println("Esto se ejecuta antes de destruirse el objeto");
	}
}
