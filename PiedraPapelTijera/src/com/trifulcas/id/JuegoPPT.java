package com.trifulcas.id;

import java.util.Arrays;

public class JuegoPPT implements ILogica {

	private String[] jugadas = { "piedra", "papel", "tijeras" };

	public JuegoPPT() {

	}

	@Override
	public int comprobar(String jugada1, String jugada2) {
		int pos1 = Arrays.asList(jugadas).indexOf(jugada1.toLowerCase());
		int pos2 = Arrays.asList(jugadas).indexOf(jugada2.toLowerCase());
		if ((pos1 + 1) % 3 == pos2)
			return 2;
		if ((pos2 + 1) % 3 == pos1)
			return 1;
		return 0;
	}

	@Override
	public String[] validas() {

		return this.jugadas;
	}

}
