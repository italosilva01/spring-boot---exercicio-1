package com.example.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.People;
import com.example.repositories.PessoaRepository;
@CrossOrigin
@RestController
public class PessoasController {
	@RequestMapping("/pessoas")
	public List<People> getPessoas(){
		return PessoaRepository.getPessoas();
		
	}
	
	@PostMapping("/pessoas")
	public People addPessoa(@RequestBody People pessoa) {
		return PessoaRepository.addPessoa(pessoa);
	}
}
