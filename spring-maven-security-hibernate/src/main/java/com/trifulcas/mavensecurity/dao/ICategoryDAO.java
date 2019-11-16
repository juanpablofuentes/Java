package com.trifulcas.mavensecurity.dao;

import java.util.List;

import com.trifulcas.mavensecurity.model.Category;

public interface ICategoryDAO {
	List<Category> getCategories();

	void save(Category category);

	Category getCategory(int idcategory);

	void delete(Category category);
}
