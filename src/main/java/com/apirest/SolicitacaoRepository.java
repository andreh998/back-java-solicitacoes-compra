package com.apirest;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitacaoRepository extends JpaRepository<Solicitacao, Long> {
	
	List<Solicitacao> findBySituacao(String situacao);
	
}
