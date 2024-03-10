package com.financa.projetoFinanca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/")
	public String index(Model modelo) {
		modelo.addAttribute("msnBemVindo","Bem vindo ao ControlFi!");
		return "pagina-login";
		
	}
}
