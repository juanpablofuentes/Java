package com.trifulcas.mavensecurity.services;

import java.util.List;

import com.trifulcas.mavensecurity.model.Product;

public interface IProductService {
	List<Product> getProducts();

	List<Product> getProducts(int id);
	
	void save(Product product);

	Product getProduct(int idproduct);

	void delete(Product product);
}
