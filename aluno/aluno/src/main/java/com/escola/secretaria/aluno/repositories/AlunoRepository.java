package com.escola.secretaria.aluno.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.escola.secretaria.aluno.entities.AlunoModel;

public interface AlunoRepository extends JpaRepository<AlunoModel, Long>{

		public List<AlunoModel> findByNome(String string);
		
}
