package com.trifulcas.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.trifulcas.hibernate.entidades.Categorias;
import com.trifulcas.hibernate.entidades.Productos;

public class LeerCategoria {

	public static void main(String[] args) {
		// Crear la configuraci�n cog�endola del xml y a�adiendo la clase Categorias
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Categorias.class)
				.addAnnotatedClass(Productos.class);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		// Crear la factor�a de sesiones
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		// Crear la sesi�n
		Session session = factory.getCurrentSession();

		try {

			// Iniciar transacci�n
			session.beginTransaction();

			// Creamos una categor�a

			Categorias cat = session.get(Categorias.class, 1);
			System.out.println(cat);
			System.out.println(cat.getProductos());
		
			// commit de la transacci�n
			session.getTransaction().commit();

		} finally {
			factory.close();
		}

	}

}
