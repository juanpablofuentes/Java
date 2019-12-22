package com.trifulcas.apirest.services;

import java.util.List;

import com.trifulcas.apirest.model.Category;

public interface ICategoryService {
	List<Category> getCategories();

	void save(Category category);

	Category getCategory(int idcategory);

	void delete(Category category);
	void delete(int idCategory);
}
