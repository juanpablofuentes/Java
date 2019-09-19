package com.trifulcas.id;


public class Juego {
	private Jugador jugador1;
	private Jugador jugador2;
	private ILogica _iLogica;

	private String[] jugadas;

	public String[] getJugadas() {
		return jugadas;
	}

	public void setJugadas(String[] jugadas) {
		this.jugadas = jugadas;
	}

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

	public Juego(Jugador jugador1, Jugador jugador2, ILogica ilogica) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		_iLogica=ilogica;
		jugadas=_iLogica.validas();
	}

	public String jugar() {
		jugador1.pedirJugada(jugadas);
		jugador2.pedirJugada(jugadas);
		System.out.println(jugador1.getNombre() + " elige " + jugador1.getJugada());
		System.out.println(jugador2.getNombre() + " elige " + jugador2.getJugada());
		int res=_iLogica.comprobar(jugador1.getJugada(), jugador2.getJugada());
		if (res == 1) { return jugador1.getNombre(); }
        if (res == 2) { return jugador2.getNombre(); }
        return "Empate"; 
	}
}
