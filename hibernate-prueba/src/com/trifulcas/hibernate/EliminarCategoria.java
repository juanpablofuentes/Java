package com.trifulcas.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.trifulcas.hibernate.entidades.Categorias;

public class EliminarCategoria {

	public static void main(String[] args) {
		// Crear la configuración cogíendola del xml y añadiendo la clase Categorias
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Categorias.class);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		// Crear la factoría de sesiones
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		// Crear la sesión
		Session session = factory.getCurrentSession();

		try {

			// Iniciar transacción
			session.beginTransaction();

			// Creamos una categoría

			Categorias cat = session.get(Categorias.class, 19);

			session.delete(cat);
			// commit de la transacción
			session.getTransaction().commit();

		} finally {
			factory.close();
		}

	}

}
