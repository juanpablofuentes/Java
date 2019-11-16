package com.trifulcas.mavensecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trifulcas.mavensecurity.model.Category;
import com.trifulcas.mavensecurity.model.Product;
import com.trifulcas.mavensecurity.services.ICategoryService;
import com.trifulcas.mavensecurity.services.IProductService;

@Controller
public class AppController {

	@Autowired
	private ICategoryService categoryService;
	@Autowired
	private IProductService productService;

	@GetMapping("/")
	public String inicio(Model modelo) {

		List<Category> categories = categoryService.getCategories();

		modelo.addAttribute("categories", categories);

		return "index";
	}

	@GetMapping("/products")
	public String productos(Model modelo, @RequestParam int id) {
		
		List<Product> products = productService.getProducts(id);
		Category category=categoryService.getCategory(id);
		modelo.addAttribute("products", products);
		modelo.addAttribute("category", category);

		return "products";
	}
}
