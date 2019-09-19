package com.trifulcas.id;

import java.util.Arrays;
import java.util.Scanner;

public class Teclado implements IJugada {

	public Teclado() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String pedirJugada(String[] validas) {
		Scanner entrada = new Scanner(System.in);
		String jugada;
		do {
			System.out.println("Introduzca la jugada");
			jugada=entrada.nextLine();
		} while(!Arrays.asList(validas).contains(jugada));
		return jugada;
	}

}
