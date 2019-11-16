package com.trifulcas.mavensecurity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trifulcas.mavensecurity.dao.ICategoryDAO;
import com.trifulcas.mavensecurity.model.Category;

@Service("categoryService")
public class CategoryService implements ICategoryService {

	@Autowired
	private ICategoryDAO categoryDAO;
	
	@Override
	@Transactional
	public List<Category> getCategories() {
		return categoryDAO.getCategories();
	}

	@Override
	@Transactional
	public void save(Category category) {
		categoryDAO.save(category);

	}

	@Override
	@Transactional
	public Category getCategory(int idcategory) {
		
		return categoryDAO.getCategory(idcategory);
	}

	@Override
	@Transactional
	public void delete(Category category) {
		categoryDAO.delete(category);

	}

}
