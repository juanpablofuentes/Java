package com.trifulcas.apirest.dao;

import java.util.List;

import com.trifulcas.apirest.model.Category;

public interface ICategoryDAO {
	List<Category> getCategories();

	void save(Category category);

	Category getCategory(int idcategory);

	void delete(Category category);
	void delete(int idCategory);
}
