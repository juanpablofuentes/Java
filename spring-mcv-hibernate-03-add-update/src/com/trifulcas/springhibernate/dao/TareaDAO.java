package com.trifulcas.springhibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.trifulcas.springhibernate.entity.Tarea;


@Repository
public class TareaDAO implements ITareaDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Tarea> getTareas() {
		Session miSesion=sessionFactory.getCurrentSession();
		
		List<Tarea> tareas=miSesion.createQuery("from Tarea",Tarea.class).list();
		return tareas;
	}

	@Override
	public void save(Tarea tarea) {

		Session miSesion=sessionFactory.getCurrentSession();
		miSesion.saveOrUpdate(tarea);
		
	}

	@Override
	public Tarea getTarea(int idtarea) {
		Session miSesion=sessionFactory.getCurrentSession();
		return miSesion.get(Tarea.class,idtarea);
	}

}
