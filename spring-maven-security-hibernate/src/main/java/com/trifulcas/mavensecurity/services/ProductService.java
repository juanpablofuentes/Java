package com.trifulcas.mavensecurity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trifulcas.mavensecurity.dao.IProductDAO;
import com.trifulcas.mavensecurity.model.Product;

@Service("productService")
public class ProductService implements IProductService {

	@Autowired
	private IProductDAO productDAO;
	
	@Override
	@Transactional
	public List<Product> getProducts() {
		return productDAO.getProducts();
	}

	@Override
	@Transactional
	public void save(Product product) {
		productDAO.save(product);

	}

	@Override
	@Transactional
	public Product getProduct(int idproduct) {
		
		return productDAO.getProduct(idproduct);
	}

	@Override
	@Transactional
	public void delete(Product product) {
		productDAO.delete(product);

	}

	@Override
	@Transactional
	public List<Product> getProducts(int id) {
		return productDAO.getProducts(id);
	}

}
