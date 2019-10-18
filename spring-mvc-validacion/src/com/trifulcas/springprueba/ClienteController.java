package com.trifulcas.springprueba;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

	@RequestMapping("/form")
	public String verForm(Model modelo) {
		Cliente cliente = new Cliente();
		
		modelo.addAttribute("cliente", cliente);
		return "form-cliente";
	}

	@RequestMapping("/procesar")
	public String procesarForm(@Valid @ModelAttribute("cliente") Cliente cliente, 
			BindingResult bindingResult) {
	
		if (bindingResult.hasErrors()) {
			return "form-cliente";
		} else {
			return "ver-cliente";
		}
	}
}
