package com.apirest.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.models.LoginForm;
import com.apirest.models.Usuario;
import com.apirest.services.UsuarioService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioService service;
	
	@GetMapping("/usuarios")
	public List<Usuario> listAll(){
		return service.listAll();
	}
	
	@PostMapping("/usuarios")
	public ResponseEntity<?> validaLogin(@RequestBody LoginForm loginForm) {		
		String login = loginForm.getLogin();
		Usuario user = service.getByLogin(login);
		if(user.getSenha().equals(loginForm.getSenha())) {
			return new ResponseEntity<>(user, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
				
	}

}
