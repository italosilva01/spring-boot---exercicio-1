package com.example.repositories;

import java.util.ArrayList;
import java.util.List;

import com.example.domain.Pessoa;

public class PessoaRepository {
	
	private static List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public static List<Pessoa> getPessoas(){
		return pessoas;
	}
	
	public static Pessoa addPessoa (Pessoa p ) {
		pessoas.add(p);
		return p;
	}

}
