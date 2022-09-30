package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class BsmController {

	@GetMapping
	public String bsm() {
		return "Lista de BSM's da Generation Brasil:"
				+ "<br>Persistência"
				+ "<br>Proatividade"
				+ "<br>Responsabilidade pessoal"
				+ "<br>Orientação ao detalhe"
				+ "<br>Trabalho em equipe"
				+ "<br>Mentalidade de crescimento"
				+ "<br>Orientação ao futuro";
				
	}
}
