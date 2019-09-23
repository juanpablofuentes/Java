package pla1.trifulcas.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		System.out.print("Introduzca el texto$>");
		
		Scanner entrada = new Scanner(System.in);  // Create a Scanner object


	    String texto = entrada.nextLine();  // Read user input
	   
	    // Manera compactass
	    ArrayList<String> frases=new ArrayList<String>(Arrays.asList(texto.split("\\.")));
	  
	    //Otra manera
	    
	    String[] f=texto.split("\\.");
	    frases.clear();
	    for(String frase:f) {
	    	frases.add(frase);
	    }
	    
	    System.out.println("Frases:");
	    System.out.println(Arrays.toString(frases.toArray()));
	    
	    //Ordenarlas de más corta a más larga:
	    Comparator<String> c = new Comparator<String>()
	    {
	        public int compare(String s1, String s2) {
	            return Integer.compare(s1.length(), s2.length());
	        }
	    };
	    Collections.sort(frases, c);
	    
	    System.out.println("Frases ordenadas:");
	    System.out.println(Arrays.toString(frases.toArray()));
	
	    //Vuelvo a cargar para volver a ordenar, esta vez con función lambda.
	    frases=new ArrayList<String>(Arrays.asList(texto.split("\\.")));
	    Collections.sort(frases, (a,b)->Integer.compare(a.length(), b.length()));

	    System.out.println("Frases ordenadas:");
	    System.out.println(Arrays.toString(frases.toArray()));
	 
	    //Vuelvo a cargar para volver a ordenar, esta vez con burbuja.
	    frases=new ArrayList<String>(Arrays.asList(texto.split("\\.")));

	    for(int i=0;i<frases.size()-1;i++) {
	    	for(int j=0;j<frases.size()-1;j++) {
	    		if (frases.get(j).length()>frases.get(j+1).length()) {
	    			Collections.swap(frases, j, j+1);
	    		}
	    	}
	    }
	    
	    System.out.println("Frases ordenadas:");
	    System.out.println(Arrays.toString(frases.toArray()));
	    String[] palabras=texto.replace(".", "").split("\\ ");
	    System.out.println("Palabras :");
	    System.out.println(Arrays.toString(palabras));
		
	    ArrayList<String> unicas=new ArrayList<String>(new HashSet<String>(Arrays.asList(palabras)));
	    
	    //Otra manera:
	    
	    unicas.clear();
	    for(String palabra:palabras) {
	    	if(!unicas.contains(palabra)) {
	    		unicas.add(palabra);
	    	}
	    }
	    System.out.println("Unicas :");
	    System.out.println(Arrays.toString(unicas.toArray()));
	
	    //Ordenamos con comparator
	    Comparator<String> c2 = new Comparator<String>()
	    {
	        public int compare(String s1, String s2) {
	            if(contar(s1,palabras)>contar(s2,palabras)) {
	            	return -1;
	            } else if(contar(s1,palabras)<contar(s2,palabras)) {
	            	return 1;
	            } else {
	            	return s1.compareTo(s2);
	            }
	        }
	    };
	    Collections.sort(unicas, c2);
	    System.out.println("Unicas ordenadas:");
	    System.out.println(Arrays.toString(unicas.toArray()));
	    
	    //Ordenamos con lambda y operador ternario
	    unicas=new ArrayList<String>(new HashSet<String>(Arrays.asList(palabras)));
	    
	    Collections.sort(unicas, (s1,s2)->contar(s1,palabras)>contar(s2,palabras)?-1:contar(s1,palabras)<contar(s2,palabras)?1:s1.compareTo(s2));

	    System.out.println("Unicas ordenadas:");
	    System.out.println(Arrays.toString(unicas.toArray()));
	
	    //Con burbuja
	    unicas=new ArrayList<String>(new HashSet<String>(Arrays.asList(palabras)));
		 
	    for(int i=0;i<unicas.size()-1;i++) {
	    	for(int j=0;j<unicas.size()-1;j++) {
	    		if (contar(unicas.get(j),palabras)<contar(unicas.get(j+1),palabras) ||
	    				unicas.get(j).compareTo(unicas.get(j+1))==-1) {
	    			Collections.swap(unicas, j, j+1);
	    		}
	    	}
	    }
	    
	    for(String palabra:unicas) {
	    	System.out.println(palabra+"|"+contar(palabra,palabras));
	    }
	    entrada.close();

	}
	
	static int contar(String palabra, String[] palabras) {
		int c=0;
		for(String p :palabras) {
			if(p.equals(palabra)) {
				c++;
			}
		}
		return c;
	}
	static int contar2(String palabra, String[] palabras) {
		return Collections.frequency(Arrays.asList(palabras),palabra);
	}
	static int pedirNumero() {
		Scanner entrada = new Scanner(System.in);
		int n;
		do {
			System.out.println("Introduzca  un número entre 1 y 10");
			n=entrada.nextInt();
		} while(n<0 || n>10);
		entrada.close();
		return n;
	}

}
