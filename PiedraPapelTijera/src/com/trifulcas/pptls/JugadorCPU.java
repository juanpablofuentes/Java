package com.trifulcas.pptls;

import java.util.Random;

public class JugadorCPU extends Jugador {

	public JugadorCPU(String nombre) {
		super(nombre);
		
	}

	@Override
	public void pedirJugada(String[] validas) {
		   Random random = new Random();
           setJugada(validas[random.nextInt( validas.length)]);
	}

}
