package com.trifulcas.ejercicio;

public class Cesar implements ICodificacion {

	private int paso=2;
	@Override
	public String codificar(String cadena) {
		
		return cifrado(cadena,paso);
	}

	@Override
	public String decodificar(String cadena) {
		
		return cifrado(cadena,-paso);
	}
	
	private String cifrado(String cadena, int paso) {
		cadena=cadena.toUpperCase();
		paso=(paso+26)%26;
		String res="";
		for(int i=0;i<cadena.length();i++) {
			int codigo=(int)cadena.charAt(i);
			if (codigo>=65 && codigo<=90) {
				res+=(char)((codigo-65+paso)%26+65);
			} else {
				res+=cadena.charAt(i);
			}
		}
		return res;
	}

}
