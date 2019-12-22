package com.trifulcas.apirest.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.trifulcas.apirest.model.Category;

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

	public Category getCategory(String name) {
		Session miSesion=sessionFactory.getCurrentSession();
		Query<Category> q = miSesion.createQuery("from Category where name=:u", 
				Category.class);
		q.setParameter("u", name);
		Category c=q.getSingleResult();
		List<Category> categorias=q.list();
		if (!categorias.isEmpty()) {
			Category cat=categorias.get(0);
		}
		
		
		return c;
	}

	@Override
	public void delete(Category category) {
		Session miSesion=sessionFactory.getCurrentSession();
		miSesion.delete(category);

	}
	@Override
	public void delete(int idCategory) {
		Session miSesion=sessionFactory.getCurrentSession();

		
		Query theQuery = 
				miSesion.createQuery("delete from Category where idcategory=:idCategory");
		theQuery.setParameter("idCategory", idCategory);
		
		theQuery.executeUpdate();	

	}

}
