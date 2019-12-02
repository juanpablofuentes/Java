package com.trifulcas.ejercicio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.trifulcas.ejercicio")
public class PruebaConfig {

	@Bean
	public IProcesar palabras() {
		return new Palabras();
	}
	
	@Bean
	public ICodificacion invertir() {
		return new Invertir();
	}
	
	@Bean
	public Codificador codificador() {
		return new Codificador(palabras(),invertir());
	}
}
