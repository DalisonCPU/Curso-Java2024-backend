package com.aula3.aula3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula3.aula3.Model.Profissao;

public interface ProfissaoRepository extends
JpaRepository<Profissao, Integer> {
}