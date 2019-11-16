package com.trifulcas.mavensecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trifulcas.mavensecurity.model.Category;
import com.trifulcas.mavensecurity.model.Product;
import com.trifulcas.mavensecurity.services.ICategoryService;
import com.trifulcas.mavensecurity.services.IProductService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private ICategoryService categoryService;
	@Autowired
	private IProductService productService;

	@GetMapping("/deletecategory")
	public String deleteCategory(@RequestParam("idcategory") int idcategory) {
		Category category = categoryService.getCategory(idcategory);
		categoryService.delete(category);

		return "redirect:/";
	}

	@GetMapping("/deleteproduct")
	public String deleteProduct(@RequestParam("idproduct") int idproduct) {
		Product product = productService.getProduct(idproduct);
		int idcategory=product.getCategory().getIdcategory();
		productService.delete(product);

		return "redirect:/products?id="+idcategory;
	}
}
