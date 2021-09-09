package com.potoware.spring.boot.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/app")
public class IndexController {
	
	@GetMapping({"/index","/","/home",""})
	public String index(Model model) {
		
		model.addAttribute("titulo", "Hola potoware con model");
		
		return "index";
	}

}
