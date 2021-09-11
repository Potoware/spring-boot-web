package com.potoware.spring.boot.web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
		usuario.setEmail("apotosi@asesoftware.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Hola Sr ".concat(usuario.getApellido()));
		return "perfil";
	}
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Alejandro");
		usuario.setApellido("Potosi");
		usuario.setEmail("apotosi@asesoftware.com");
		model.addAttribute("titulo", "Hola, estos son los usuarios ".concat(usuario.getApellido()));
		return "listar";
	}
	
	@ModelAttribute("usuarios")
	public List<Usuario> poblaUsuarios(){
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario ("Andres","Camargo","acamargo@camargo.com"));
		usuarios.add(new Usuario("Alejandro", "Potosi", "apotosi@potoware.com"));
		usuarios.add(new Usuario("Rocky", "Sucio", "rsucio@potoware.com"));
		
		return usuarios;
	}

}
