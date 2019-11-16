package com.trifulcas.mavensecurity.services;

import java.util.List;

import com.trifulcas.mavensecurity.model.Category;

public interface ICategoryService {
	List<Category> getCategories();

	void save(Category category);

	Category getCategory(int idcategory);

	void delete(Category category);
}
