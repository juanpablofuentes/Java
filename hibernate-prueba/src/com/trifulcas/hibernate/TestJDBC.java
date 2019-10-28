package com.trifulcas.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

	public static void main(String[] args) {
		String bd="empresa";
		String jdbcUrl = "jdbc:mysql://localhost:3306/"+bd+"?useSSL=false&serverTimezone=UTC";
		String user = "root";
		String pass = "";
		
		try {
			System.out.println("Conectando: " + jdbcUrl);
			
			Connection myConn =
					DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("Todo bien. Circulen.");
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}

	}

}
