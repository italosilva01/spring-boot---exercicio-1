package com.example.repositories;

import java.util.ArrayList;
import java.util.List;

import com.example.domain.People;

public class PessoaRepository {
	
	private static List<People> pessoas = new ArrayList<People>();
	
	public static List<People> getPessoas(){
		return pessoas;
	}
	
	public static People addPessoa (People p ) {
		pessoas.add(p);
		return p;
	}

}
