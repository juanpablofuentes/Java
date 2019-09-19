package com.trifulcas.id;

import java.util.Arrays;
import java.util.Scanner;

public class Jugador {
	private String nombre;
	private String jugada;
	private IJugada ijugada;
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getJugada() {
		return jugada;
	}

	public void setJugada(String jugada) {
		this.jugada = jugada;
	}

	public Jugador(String nombre, IJugada ijugada) {
		this.nombre=nombre;
		this.ijugada=ijugada;
	}

	public void pedirJugada(String[] validas) {
		jugada=ijugada.pedirJugada(validas);
		
	}
}
