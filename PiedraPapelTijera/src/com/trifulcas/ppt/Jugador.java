package com.trifulcas.ppt;

import java.util.Arrays;
import java.util.Scanner;

public class Jugador {
	private String nombre;
	private String jugada;
	
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

	public Jugador(String nombre) {
		this.nombre=nombre;
	}

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
