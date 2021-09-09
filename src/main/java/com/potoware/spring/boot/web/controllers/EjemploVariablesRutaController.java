package com.potoware.spring.boot.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("variables")
public class EjemploVariablesRutaController {
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("titulo","enviar parametros de la ruta (@Patvariblee)");
		return "variables/index";
	}
	
	@GetMapping("/string/{texto}")
	public String variables (@PathVariable String texto, Model model) {
		model.addAttribute("titulo","Recibir parametros de la ruta (@Patvariblee)");
		model.addAttribute("resultado","el texto enviado en la ruta es: "+ texto);
		return "variables/ver";
		
	}
	@GetMapping("/string/{texto}/{textotwo}")
	public String variables (@PathVariable String texto,@PathVariable String textotwo ,Model model) {
		model.addAttribute("titulo","Recibir parametros de la ruta (@Patvariblee)");
		model.addAttribute("resultado","el texto enviado en la ruta es: "+ texto+" y el numero de celular es: "+ textotwo);
		
		return "variables/ver";
		
	}


}
