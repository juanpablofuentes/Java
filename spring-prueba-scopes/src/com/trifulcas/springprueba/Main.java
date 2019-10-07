package com.trifulcas.springprueba;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// Cargar el contexto
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextBean.xml");

		// Pedir el bean
		Saludos miSaludo = context.getBean("miSaludo", Saludos.class);
		
		Saludos otroSaludo= context.getBean("miSaludo", Saludos.class);
		
		//Los dos son iguales (SIngleton por defecto)
		System.out.println(miSaludo.equals(otroSaludo));
		
		//Y apuntan a la misma dirección de memoria
		System.out.println(miSaludo);
		System.out.println(otroSaludo);
		
		// Cerrar el contexto
		context.close();
	}

}
