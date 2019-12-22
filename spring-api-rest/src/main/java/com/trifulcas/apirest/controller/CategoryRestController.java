package com.trifulcas.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trifulcas.apirest.model.Category;
import com.trifulcas.apirest.services.ICategoryService;

@RestController
@RequestMapping("/api")
public class CategoryRestController {

	@Autowired
	private ICategoryService categoryService;

	@GetMapping("/categories")
	public List<Category> getCategories() {
		return categoryService.getCategories();
	}

	@GetMapping("/categories/{idcategory}")
	public Category getCategory(@PathVariable int idcategory) {
		return categoryService.getCategory(idcategory);
	}

	@PostMapping("/categories")
	public Category addCategory(@RequestBody Category category) {
		categoryService.save(category);
		return category;
	}

	@PutMapping("/categories")
	public Category updateCategory(@RequestBody Category category) {
		categoryService.save(category);
		return category;
	}

	@DeleteMapping("/categories/{idcategory}")
	public String deleteCategory(@PathVariable int idcategory) {
		categoryService.delete(idcategory);
		return "Category " + idcategory + " deleted";
	}

}
