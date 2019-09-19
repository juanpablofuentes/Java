package com.trifulcas.ppt;

public class Main {

	public static void main(String[] args) {
		Jugador eva = new Jugador("Eva");
        Jugador juan = new Jugador("Juan");
        Juego game = new Juego(eva, juan);
        System.out.println("Ganador: "+game.jugar());
       
	}

}
