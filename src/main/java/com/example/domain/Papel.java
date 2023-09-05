package com.example.domain;

public class Papel {
	private String nomePapel;
	private String responsabilidaes;
	public String getNomePapel() {
		return nomePapel;
	}
	public void setNomePapel(String nomePapel) {
		this.nomePapel = nomePapel;
	}
	public String getResponsabilidaes() {
		return responsabilidaes;
	}
	public void setResponsabilidaes(String responsabilidaes) {
		this.responsabilidaes = responsabilidaes;
	}
	public Papel(String nomePapel, String responsabilidaes) {
		super();
		this.nomePapel = nomePapel;
		this.responsabilidaes = responsabilidaes;
	}
	
	
}
