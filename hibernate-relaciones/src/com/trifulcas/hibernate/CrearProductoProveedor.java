package com.trifulcas.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.trifulcas.hibernate.entidades.*;

public class CrearProductoProveedor {

	public static void main(String[] args) {

		// Crear la configuración cogíendola del xml y añadiendo la clase Categorias
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Categorias.class)
				.addAnnotatedClass(Proveedores.class)
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

			Proveedores paco= new Proveedores("Paco", "11111", "Turruncún");
			
			session.save(paco);

			Productos pepino = new Productos("Pepino", "Francés", 5);
			Productos endivia = new Productos("Endivia", "Nada envidiosa", 7);
			
			paco.addProducto(pepino);
			paco.addProducto(endivia);
			session.save(pepino);
			session.save(endivia);
			// commit de la transacción
			session.getTransaction().commit();
			session.close();

		} finally {
			factory.close();
		}
	}

}
