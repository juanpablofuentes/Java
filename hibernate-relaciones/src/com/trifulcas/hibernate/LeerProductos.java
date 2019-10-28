package com.trifulcas.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.trifulcas.hibernate.entidades.Categorias;
import com.trifulcas.hibernate.entidades.Productos;

public class LeerProductos {

	public static void main(String[] args) {
		// Crear la configuración cogíendola del xml y añadiendo la clase Categorias
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Categorias.class)
				.addAnnotatedClass(Productos.class);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		// Crear la factoría de sesiones
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		// Crear la sesión
		Session session = factory.getCurrentSession();

		try {

			// Iniciar transacción
			session.beginTransaction();

			// Leemos un producto

			Productos prod = session.get(Productos.class, 1);
			System.out.println(prod);
			
			
			// commit de la transacción
			session.getTransaction().commit();

		} finally {
			factory.close();
		}

	}

}
