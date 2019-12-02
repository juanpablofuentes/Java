package com.trifulcas.ejercicio;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// Cargar el contexto
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PruebaConfig.class);

	
		// Pedir el bean
		Codificador test = context.getBean("codificador", Codificador.class);

		// Ejecutar algún método
		System.out.println(test.codificar("abcdefghijklmnopqrstuvwxyz"));
		System.out.println(test.decodificar("abcdefghijklmnopqrstuvwxyz"));

		// Cerrar el contexto
		context.close();
	}

}
