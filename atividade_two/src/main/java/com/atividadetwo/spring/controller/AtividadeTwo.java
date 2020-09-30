package com.atividadetwo.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividadetwo")
public class AtividadeTwo {
	
	@GetMapping
	public String atividadeTwo() {
		return "Objetivos: Aprender a utilizar o framework SpringBoot!";
	}
	
}
