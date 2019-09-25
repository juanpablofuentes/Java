package com.trifulcas.id;

public class Main {

	public static void main(String[] args) {
		ISaludo[] varios=new ISaludo[] {new Cliente(),new Cliente(),new Empleado()};
		
		for(ISaludo el:varios) {
			el.Saludo();
		}

		Contenedor c1=new Contenedor(varios[0]);
		Contenedor c2=new Contenedor(varios[2]);
		
		c1.saludar();
		c2.saludar();
	}

}
