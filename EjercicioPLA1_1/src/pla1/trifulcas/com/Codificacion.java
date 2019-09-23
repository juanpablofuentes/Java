package pla1.trifulcas.com;

import java.util.ArrayList;
import java.util.Arrays;

public class Codificacion {

	public static String[] codigo = { "ABC", "DEF", "GHI", "JKL", "MNO", "PRS", "TUV", "WXY" };

	public static void main(String[] args) {
		System.out.println(codificar("ABCDEFGHIJKLMNOPRSTUVWXY"));
		System.out.println(codificar("misil"));
		decodificar2("89");
		decodificar2("765");
	}

	public static String codificar(String palabra) {
		String res = "";
		palabra = palabra.toUpperCase();
		for (int i = 0; i < palabra.length(); i++) {
			res += buscarLetra(palabra.substring(i, i + 1));
		}

		return res;
	}

	public static String buscarLetra(String s) {

		for (int i = 0; i < codigo.length; i++) {
			if (codigo[i].contains(s)) {
				return Integer.toString(i + 2);
			}
		}

		return "";
	}
	public static void decodificar(String numero) {
		decodificar(numero,"");
	}
	public static void decodificar(String numero, String pre) {
		int n;
		if (numero.equals("")) {
			System.out.println(pre);
		} else {
			n = Integer.parseInt(numero.substring(0, 1));
			for(int j=0;j<codigo[n-2].length();j++) {
				decodificar(numero.substring(1),pre+codigo[n-2].substring(j,j+1));
			}
		
		}
	}
	
	public static void decodificar2(String numero) {
		ArrayList<String> res=new ArrayList<String>();
		int n;
		res.add("");
		for(int i=0;i<numero.length();i++) {
			ArrayList<String> temp=new ArrayList<String>();
			 n= Integer.parseInt(numero.substring(i,i+ 1));
			for(String el:res) {
				for(int j=0;j<codigo[n-2].length();j++) {
					temp.add(el+codigo[n-2].substring(j,j+1));
				}
			}
			res=temp;
		}
		  System.out.println(Arrays.toString(res.toArray()));
	}

}
