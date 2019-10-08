package com.trifulcas.springprueba;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.trifulcas.springprueba")
public class PruebaConfig {

	@Bean
	public ISaludo formal() {
		return new Formal();
	}
	
	@Bean
	public IPresentacion vecino() {
		return new Vecino(formal());
	}
}
