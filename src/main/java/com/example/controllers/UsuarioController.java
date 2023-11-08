package com.example.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.User;
import com.example.repositories.UsuarioRepository;
@CrossOrigin

@RestController
public class UsuarioController {
	@RequestMapping("/usuarios")
	public List<User> getUsuarios(){
		return UsuarioRepository.getUsuarios();
	}

	@PostMapping("/usuarios")
	public User addUsuario(@RequestBody User us) {
		return UsuarioRepository.addUsuario(us);
	}
}
