package com.trifulcas.id;

import java.util.Arrays;

public class JuegoPPTLS implements ILogica {

	private String[] jugadas = { "piedra", "papel", "tijeras", "spock", "lagarto" };

	public JuegoPPTLS() {

	}

	@Override
	public int comprobar(String jugada1, String jugada2) {
		int pos1 = Arrays.asList(jugadas).indexOf(jugada1.toLowerCase());
		int pos2 = Arrays.asList(jugadas).indexOf(jugada2.toLowerCase());
		if ((pos1 + 1) % jugadas.length == pos2 || (pos1 + 3) % jugadas.length == pos2)
			return 2;
		if ((pos2 + 1) % jugadas.length == pos1 || (pos2 + 3) % jugadas.length == pos1)
			return 1;
		return 0;
	}

	@Override
	public String[] validas() {

		return this.jugadas;
	}

}
