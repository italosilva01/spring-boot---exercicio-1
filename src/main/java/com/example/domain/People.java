package com.example.domain;

import com.example.Exercicio.AbstractEntity;

public class People extends AbstractEntity {
	
	private String name;
	private int age;
	private double height;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public People(String nome, int idade, double altura, User[] usuarios) {
		super();
		this.name = nome;
		this.age = idade;
		this.height = altura;
	}

	

	
}
