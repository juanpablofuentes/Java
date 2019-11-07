package com.trifulcas.springseguridad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/formlogin")
	public String formLogin() {
		return "login";
	}
}
