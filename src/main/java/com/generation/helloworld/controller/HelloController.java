package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "<b>BSM Generation:</b> <br /> Habilidades:<br /> -> Atenção aos Detalhes<br />-> Trabalho em equipe<br /> -> Proativade<br /> -> Comunicação<br /><br /> Mentalidades:<br />-> Orientação ao Futuro<br />-> Resposabilidade Pessoal<br />-> Mentalidade de Crescimento<br />-> Persistência";
	}
	
	@GetMapping("/objetivo")
	public String objetivo() {
		return "<b>Meus Objetivos:</b> <br /> Compreender e aplicar os conceitos de MySql e Spring Boot.";
	}

}
