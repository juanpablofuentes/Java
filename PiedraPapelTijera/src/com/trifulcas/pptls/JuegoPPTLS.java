package com.trifulcas.pptls;

import java.util.Arrays;

public class JuegoPPTLS extends Juego {

	public JuegoPPTLS(Jugador jugador1, Jugador jugador2) {
		super(jugador1, jugador2);
		setJugadas(new String[] { "piedra", "papel", "tijeras", "spock", "lagarto" });
	}

	@Override
	public String comprobar(Jugador jugador1, Jugador jugador2) {
		int pos1 = Arrays.asList(getJugadas()).indexOf(jugador1.getJugada().toLowerCase());
		int pos2 = Arrays.asList(getJugadas()).indexOf(jugador2.getJugada().toLowerCase());
		if ((pos1 + 1) % getJugadas().length == pos2 || (pos1 + 3) % getJugadas().length == pos2)
			return jugador2.getNombre();
		if ((pos2 + 1) % getJugadas().length == pos1 || (pos2 + 3) % getJugadas().length == pos1)
			return jugador1.getNombre();
		return "Empate";
	}

}
