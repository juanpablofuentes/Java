import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {

		System.out.println("Hola ¿que tal?");

		int a = 5;
		int b = 9;

		int c = a * b;

		System.out.println(c);

		Scanner in = new Scanner(System.in);

		System.out.println("¿Cómo te llamas?");
		String nombre = in.nextLine();
		System.out.println("Hola "+nombre+" ¿que tal?");
		System.out.println("¿Qué edad tienes?");
		int edad=in.nextInt();
		if (edad<18) {
			System.out.println("Eres menor de edad");
		} else {
			System.out.println("¿Qué quieres tomar?");
		}
		
		for(int i=1;i<=100;i++) {
			if (i%6==0) {
				System.out.println(i);
			}
		}
	}

}
