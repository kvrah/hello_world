package com.generation.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class helloWorldController {

	@GetMapping
	public String helloWorld() {
		return "Hello World!!";
	}

@RequestMapping("/bsm")
	@GetMapping
	public String Listabsm() {
		return ("Mentalidade de Crescimento"
				+ "\npersistencia"
				+ "\nResponsabilidade pessoal"
				+ "\norientação ao futuro"
				+ "\norientação ao detalhe"
				+ "\nproatividade"
				+ "\ntrabalho em equipe"
				+ "\ncomunicação");
	}

@RequestMapping("/obj")
	@GetMapping
	public String obj() {
		return ("Aprender Spring"
				+ "\nAvançar etapas do PI"
				+ "\ntrabalhar soft Skills");
	}
	
}
