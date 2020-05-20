package com.apirest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirest.models.Solicitacao;

public interface SolicitacaoRepository extends JpaRepository<Solicitacao, Long> {
	
	List<Solicitacao> findBySituacao(String situacao);
	
}
