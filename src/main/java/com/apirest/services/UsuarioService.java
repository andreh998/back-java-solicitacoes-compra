package com.apirest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.models.Usuario;
import com.apirest.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repo;
	
	
	public List<Usuario> listAll() {
		return repo.findAll();
	}
	
	public void save(Usuario usuario) {
		repo.save(usuario);
	}
	
	public Usuario get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	public Usuario getByLogin(String usuario) {
		return repo.findByLogin(usuario);
	}
		
	
}
