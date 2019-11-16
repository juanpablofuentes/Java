package com.trifulcas.mavensecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trifulcas.mavensecurity.model.Category;
import com.trifulcas.mavensecurity.model.Product;
import com.trifulcas.mavensecurity.services.ICategoryService;
import com.trifulcas.mavensecurity.services.IProductService;

@Controller
@RequestMapping("/gerente")
public class GerenteController {
	@Autowired
	private ICategoryService categoryService;
	@Autowired
	private IProductService productService;

	@GetMapping("/addcategory")
	public String addCategory(Model modelo) {
		Category category = new Category();
		modelo.addAttribute(category);
		return "form-category";
	}

	@PostMapping("/savecategory")
	public String saveCategory(@ModelAttribute("category") Category category) {

		categoryService.save(category);
		return "redirect:/";
	}

	@GetMapping("updatecategory")
	public String updateCategory(@RequestParam("idcategory") int idcategory, Model modelo) {

		Category category = categoryService.getCategory(idcategory);
		modelo.addAttribute(category);
		return "form-category";
	}

	@GetMapping("/addproduct")
	public String addproduct(Model modelo) {
		Product product = new Product();
		modelo.addAttribute(product);

		List<Category> categories = categoryService.getCategories();
		modelo.addAttribute("categories", categories);

		return "form-product";
	}

	@PostMapping("/saveproduct")
	public String saveProduct(@ModelAttribute("product") Product product) {

		productService.save(product);
		return "redirect:/products?id="+product.getCategory().getIdcategory();
	}

	@GetMapping("updateproduct")
	public String updateTarea(@RequestParam("idproduct") int idproduct, Model modelo) {

		Product product = productService.getProduct(idproduct);
		modelo.addAttribute(product);
		List<Category> categories = categoryService.getCategories();
		modelo.addAttribute("categories", categories);

		return "form-product";
	}

}
