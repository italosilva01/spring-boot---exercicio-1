package com.example.domain;

import com.example.Exercicio.AbstractEntity;

public class Pessoa extends AbstractEntity {
	
	private String nome;
	private int idade;
	private double altura;
	private Usuario[] usuarios;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public Usuario[] getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Usuario[] usuarios) {
		this.usuarios = usuarios;
	}
	public Pessoa(String nome, int idade, double altura, Usuario[] usuarios) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.usuarios = usuarios;
	}

	

	
}
