package com.trifulcas.springprueba;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// Cargar el contexto
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PruebaConfig.class);

		// Pedir el bean
		ISaludo miSaludo = context.getBean("miSaludo", Saludos.class);

		// Ejecutar algún método
		System.out.println(miSaludo.hola());

		// Pedir el bean
		ISaludo miVecino = context.getBean("vecino", Vecino.class);

		// Ejecutar algún método
		System.out.println(miVecino.hola());

		// Cerrar el contexto
		context.close();
	}

}
