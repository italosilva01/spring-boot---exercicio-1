package com.example.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Pessoa;
import com.example.repositories.PessoaRepository;

@RestController
public class PessoasController {
	@RequestMapping("/pessoas")
	public List<Pessoa> getPessoas(){
		return PessoaRepository.getPessoas();
		
	}
	
	@PostMapping("/pessoas")
	public Pessoa addPessoa(@RequestBody Pessoa pessoa) {
		return PessoaRepository.addPessoa(pessoa);
	}
}
