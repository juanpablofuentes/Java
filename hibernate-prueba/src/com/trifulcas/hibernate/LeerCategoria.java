package com.trifulcas.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.trifulcas.hibernate.entidades.Categorias;

public class LeerCategoria {

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

			Categorias cat = session.get(Categorias.class, 1);
			System.out.println(cat);
			
			@SuppressWarnings("unchecked")
			List<Categorias> lista = session
					.createQuery("from Categorias c where c.nombre like '%cat%' ").getResultList();

			for (Categorias c : lista) {
				System.out.println(c);
			}
			// commit de la transacción
			session.getTransaction().commit();

		} finally {
			factory.close();
		}

	}

}
