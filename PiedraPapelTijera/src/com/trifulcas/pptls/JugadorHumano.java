package com.trifulcas.pptls;

import java.util.Arrays;
import java.util.Scanner;

public class JugadorHumano extends Jugador {

	public JugadorHumano(String nombre) {
		super(nombre);
	
	}

	@Override
	public void pedirJugada(String[] validas) {
		Scanner entrada = new Scanner(System.in);
		String jugada;
		do {
			System.out.println(getNombre()+" introduzca la jugada");
			jugada=entrada.nextLine();
		} while(!Arrays.asList(validas).contains(jugada));
		setJugada(jugada);

	}

}
