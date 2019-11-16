package com.trifulcas.mavensecurity.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.trifulcas.mavensecurity.model.Category;

@Repository
public class CategoryDAO implements ICategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Category> getCategories() {
		Session miSesion = sessionFactory.getCurrentSession();

		List<Category> category = miSesion.createQuery("from Category", Category.class).list();
		return category;
	}

	@Override
	public void save(Category category) {
		Session miSesion=sessionFactory.getCurrentSession();
		miSesion.saveOrUpdate(category);
	}

	@Override
	public Category getCategory(int idcategory) {
		Session miSesion=sessionFactory.getCurrentSession();
		return miSesion.get(Category.class,idcategory);
	}

	@Override
	public void delete(Category category) {
		Session miSesion=sessionFactory.getCurrentSession();
		miSesion.delete(category);

	}

}
