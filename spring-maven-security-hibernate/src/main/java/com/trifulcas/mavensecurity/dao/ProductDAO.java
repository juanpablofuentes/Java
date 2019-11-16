package com.trifulcas.mavensecurity.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.trifulcas.mavensecurity.model.Product;

@Repository
public class ProductDAO implements IProductDAO {

	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Product> getProducts() {
		Session miSesion = sessionFactory.getCurrentSession();
		List<Product> productos=miSesion.createQuery("from Product", Product.class).list();
		return productos;
	}

	public List<Product> getProducts(int idcategory) {
		Session miSesion = sessionFactory.getCurrentSession();
		List<Product> productos=miSesion.createQuery("from Product where idcategory=:idcategory", 
				Product.class).setParameter("idcategory", idcategory).list();
		return productos;
	}
	@Override
	public void save(Product product) {
		Session miSesion = sessionFactory.getCurrentSession();
		miSesion.saveOrUpdate(product);

	}

	@Override
	public Product getProduct(int idproduct) {
		Session miSesion = sessionFactory.getCurrentSession();
		return miSesion.get(Product.class,idproduct);
	}

	@Override
	public void delete(Product product) {
		Session miSesion = sessionFactory.getCurrentSession();
		miSesion.delete(product);
	}

}
