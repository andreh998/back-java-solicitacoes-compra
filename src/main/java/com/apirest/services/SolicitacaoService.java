package com.apirest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.models.Solicitacao;
import com.apirest.repositories.SolicitacaoRepository;

@Service
public class SolicitacaoService {
	
	@Autowired
	private SolicitacaoRepository repo;
	
	
	public List<Solicitacao> listAll() {
		return repo.findAll();
	}
	
	public void save(Solicitacao solicitacao) {
		repo.save(solicitacao);
	}
	
	public Solicitacao get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	public List<Solicitacao> getBySituacao(String situacao) {
		return repo.findBySituacao(situacao);
	}
		
}
