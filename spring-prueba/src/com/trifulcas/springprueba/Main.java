package com.trifulcas.springprueba;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// Cargar el contexto
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Pedir el bean
		ISaludo miSaludo = context.getBean("miSaludo", Saludos.class);
		
		// Ejecutar algún método
		System.out.println(miSaludo.hola());
		
		// Pedir el bean
		ISaludo miVecino = context.getBean("miVecino", Vecino.class);
		
		// Ejecutar algún método
		System.out.println(miVecino.hola());
		// Cerrar el contexto
		context.close();
	}

}
