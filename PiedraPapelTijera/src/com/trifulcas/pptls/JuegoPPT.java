package com.trifulcas.pptls;

import java.util.Arrays;

public class JuegoPPT extends Juego {

	public JuegoPPT(Jugador jugador1, Jugador jugador2) {
		super(jugador1, jugador2);
		  setJugadas(new String[]{ "piedra", "papel", "tijeras" });
	}

	@Override
	public String comprobar(Jugador jugador1, Jugador jugador2) {
		
		int pos1 = Arrays.asList(getJugadas()).indexOf(jugador1.getJugada().toLowerCase());
		int pos2 = Arrays.asList(getJugadas()).indexOf(jugador2.getJugada().toLowerCase());
		if ((pos1 + 1) % 3 == pos2)
			return jugador2.getNombre();
		if ((pos2 + 1) % 3 == pos1)
			return jugador1.getNombre();
		return "Empate";
	}

}
