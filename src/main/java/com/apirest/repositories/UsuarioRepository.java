package com.apirest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirest.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	Usuario findByLogin(String login);
	
}