package com.trifulcas.springprueba;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// Cargar el contexto
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PruebaConfigInformal.class);

	
		// Pedir el bean
		IPresentacion miVecino = context.getBean("vecino", IPresentacion.class);

		// Ejecutar algún método
		System.out.println(miVecino.presentacion());

		// Cerrar el contexto
		context.close();
	}

}
