package com.trifulcas.ejercicio;

import java.util.ArrayList;
import java.util.Arrays;

public class Palabras implements IProcesar {

	@Override
	public ArrayList<String> dividir(String cadena) {
		
		return new ArrayList<String>(Arrays.asList(cadena.split(" ")));
	}

	@Override
	public String unir(ArrayList<String> cadenas) {
		return String.join(" ", cadenas);
	}

}
