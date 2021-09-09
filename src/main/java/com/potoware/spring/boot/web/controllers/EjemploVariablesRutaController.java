package com.potoware.spring.boot.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("variables")
public class EjemploVariablesRutaController {
	
	@GetMapping("/string/{texto}")
	public String variables (@PathVariable String texto, Model model) {
		model.addAttribute("titulo","Recibir parametros de la ruta (@Patvariblee)");
		model.addAttribute("resultado","el texto enviado en la ruta es: "+ texto);
		return "variables/ver";
		
	}

}
