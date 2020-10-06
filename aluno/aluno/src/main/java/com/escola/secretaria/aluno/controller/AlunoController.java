package com.escola.secretaria.aluno.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escola.secretaria.aluno.entities.AlunoModel;
import com.escola.secretaria.aluno.repositories.AlunoRepository;

@RestController
@RequestMapping("/secretaria")
public class AlunoController {
	
	@Autowired
	private AlunoRepository repository;
	
	@GetMapping("/alunos")
	public List<AlunoModel> findAll() {
		return repository.findAll();
	}
	
	@GetMapping("/alunos/nome/{nome}")
	public List<AlunoModel> findByName(@PathVariable String nome) {
		return repository.findByNome(nome);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<AlunoModel> GetById(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping("/alunos")
	public AlunoModel criar (@RequestBody AlunoModel model) {
		repository.save(model);
		return model;	
	}

	@PutMapping("/nome/{id}")
	public AlunoModel atualizar(@PathVariable Long id, @RequestBody AlunoModel model) {
		model.setId(id);
		repository.save(model);
		return model;
	}
	
	@DeleteMapping("/alunos/{id}")
	public String remover(@PathVariable Long id) {	
		repository.deleteById(id);
	return "sucesso";
	}
	

}

