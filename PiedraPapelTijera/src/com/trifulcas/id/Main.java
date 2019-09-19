package com.trifulcas.id;

public class Main {

	public static void main(String[] args) {
		 Jugador eva = new Jugador("Eva", new Teclado());
         Jugador juan = new Jugador("Juan", new CPU());
         Juego ppt = new Juego(eva, juan, new JuegoPPTLS());
         System.out.println(ppt.jugar());
       

	}

}
