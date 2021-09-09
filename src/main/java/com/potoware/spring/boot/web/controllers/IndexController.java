package com.potoware.spring.boot.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.potoware.spring.boot.web.model.Usuario;


@Controller
@RequestMapping("/app")
public class IndexController {
	
	@GetMapping({"/index","/","/home",""})
	public String index(Model model) {
		
		model.addAttribute("titulo", "Hola potoware con model");
		
		return "index";
	}
	
	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		
		usuario.setNombre("Alejandro");
		usuario.setApellido("Potosi");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Hola Sr ".concat(usuario.getApellido()));
		return "perfil";
	}

}
