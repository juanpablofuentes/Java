package com.trifulcas.ppt;

import java.util.Arrays;

public class Juego {

	private Jugador jugador1;
	private Jugador jugador2;

	private String[] jugadas = new String[] { "piedra", "papel", "tijeras" };

	public Jugador getJugador1() {
		return jugador1;
	}

	public void setJugador1(Jugador jugador1) {
		this.jugador1 = jugador1;
	}

	public Jugador getJugador2() {
		return jugador2;
	}

	public void setJugador2(Jugador jugador2) {
		this.jugador2 = jugador2;
	}

	public Juego(Jugador jugador1, Jugador jugador2) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
	}

	public String jugar() {
		jugador1.pedirJugada(jugadas);
		System.out.println(jugador1.getNombre() + " elige " + jugador1.getJugada());
		jugador2.pedirJugada(jugadas);
		System.out.println(jugador2.getNombre() + " elige " + jugador2.getJugada());
		return comprobar(jugador1, jugador2);
	}

	private String comprobar(Jugador jugador1, Jugador jugador2) {
		int pos1 = Arrays.asList(jugadas).indexOf(jugador1.getJugada().toLowerCase());
		int pos2 = Arrays.asList(jugadas).indexOf(jugador2.getJugada().toLowerCase());
		if ((pos1 + 1) % 3 == pos2)
			return jugador2.getNombre();
		if ((pos2 + 1) % 3 == pos1)
			return jugador1.getNombre();
		return "Empate";
	}

}
