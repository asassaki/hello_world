package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")

public class ObjetivosController {

	@GetMapping
	public String objetivos() {
		return "Objetivos de aprendizagem:"
				+ "<br>Comunicação do trabalho em equipe";
	}
}
