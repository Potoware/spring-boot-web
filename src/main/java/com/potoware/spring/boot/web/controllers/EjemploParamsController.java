package com.potoware.spring.boot.web.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {

	@GetMapping("/string")
	public String param(@RequestParam(name="name") String texto,Model model) {
		model.addAttribute("resultado","El texto enviado es: "+texto);
		return "params/ver";
	}
	
	@GetMapping("/")
	public String index() {
		
		return "params/index";
	}
	
	@GetMapping("/mix-params")
	public String param(@RequestParam String saludo , @RequestParam Integer numero, Model model) {
		model.addAttribute("resultado",saludo.concat(" Como estas?, recuerda que hoy es "+numero));
		return "params/ver";
	}
	
	@GetMapping("/mix-params-request")
	public String param(HttpServletRequest request, Model model) {
		String saludo = request.getParameter("saludo");
		Integer numero = Integer.parseInt(request.getParameter("numero"));
		model.addAttribute("resultado",saludo.concat(" Como estas?, recuerda que hoy es "+numero));
		return "params/ver";
	}
}
