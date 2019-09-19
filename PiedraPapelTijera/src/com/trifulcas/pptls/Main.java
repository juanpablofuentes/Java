package com.trifulcas.pptls;

public class Main {

	public static void main(String[] args) {
		Jugador n=new JugadorCPU("HAL9000");
		Jugador pepe=new JugadorHumano("Pepe");
		
		Juego normal=new JuegoPPT(n,pepe);
		System.out.println(normal.jugar());
		Juego nuevo=new JuegoPPTLS(n,pepe);
		System.out.println(nuevo.jugar());
	}

}
