package com.trifulcas.mavensecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gerente")
public class GerenteController {

	@GetMapping("/")
	public String inicio() {
		return "index-gerente";
	}
	
}