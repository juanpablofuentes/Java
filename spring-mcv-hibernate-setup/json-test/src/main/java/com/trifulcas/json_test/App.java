package com.trifulcas.json_test;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
	public static void main(String[] args) {
		try {
			ObjectMapper mapper = new ObjectMapper();

			Producto producto = mapper.readValue(new File("datos/producto.json"), Producto.class);

			System.out.println(producto.getNombre());

			String jsonInString = mapper.writeValueAsString(producto);
			System.out.println(jsonInString);
			
			ProductoC productoc = mapper.readValue(new File("datos/producto-complejo.json"), ProductoC.class);

			System.out.println(productoc.getNombre());
			System.out.println(productoc.getZonas()[0]);

			 jsonInString = mapper.writeValueAsString(productoc);
			System.out.println(jsonInString);
			
			
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
