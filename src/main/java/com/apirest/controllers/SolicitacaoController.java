package com.apirest.controllers;

import java.util.List;
import java.util.NoSuchElementException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.models.Solicitacao;
import com.apirest.services.SolicitacaoService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class SolicitacaoController {
	
	@Autowired
	private SolicitacaoService service;
	
	@GetMapping("/solicitacoes")
	public List<Solicitacao> list() {
		return service.listAll();
	}
	
	@GetMapping("/solicitacoes/{id}")
	public ResponseEntity<Solicitacao> get(@PathVariable Long id) {
		try {
			Solicitacao solicitacao =  service.get(id);
			return new ResponseEntity<Solicitacao>(solicitacao, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Solicitacao>(HttpStatus.NOT_FOUND);
		}
	}
		
	@PostMapping("/solicitacoes")
	public ResponseEntity<?> add(@Valid @RequestBody Solicitacao solicitacao) {	
		service.save(solicitacao);
		return new ResponseEntity<>(solicitacao, HttpStatus.OK);
	}
	
	@GetMapping("/solicitacoes/status")
	public List<Solicitacao> listSolicitacoesStatus(@RequestParam String situacao) {		
		return service.getBySituacao(situacao);
	}
	
	@PutMapping("/solicitacoes/{id}")
	public ResponseEntity<?> update(@RequestBody Solicitacao solicitacao, @PathVariable Long id) {
		try {
			Solicitacao existSolicitacao = service.get(id);
			service.save(solicitacao);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	
}
