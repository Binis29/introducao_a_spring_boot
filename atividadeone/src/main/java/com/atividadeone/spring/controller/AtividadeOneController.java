package com.atividadeone.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividadeone")

public class AtividadeOneController {
	
	@GetMapping
	public String atividadeOne() {
		return "Utilizamos a habilidade de atenção a detalhes e a mentalidade de persistência!";
	}
	
	
	
	
	
	

}
