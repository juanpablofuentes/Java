package com.trifulcas.ejercicio;

import java.util.ArrayList;
import java.util.Arrays;

public class Bloques implements IProcesar {

	private int longitud=4;
	@Override
	public ArrayList<String> dividir(String cadena) {
		return new ArrayList<String>(Arrays.asList(cadena.split("(?<=\\G.{"+longitud+"})")));
	}
	@Override
	public String unir(ArrayList<String> cadenas) {
		return  String.join("", cadenas);
	}

}
