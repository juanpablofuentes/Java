package com.trifulcas.springprueba;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// Cargar el contexto
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Pedir el bean
		Saludos miSaludo = context.getBean("miSaludo", Saludos.class);
		Saludos otroSaludo = context.getBean("miSaludo", Saludos.class);

		// Ejecutar algún método
		System.out.println(miSaludo.equals(otroSaludo));
		System.out.println(miSaludo);
		System.out.println(otroSaludo);
		miSaludo=null;
		// Cerrar el contexto
		context.close();
	}

}
