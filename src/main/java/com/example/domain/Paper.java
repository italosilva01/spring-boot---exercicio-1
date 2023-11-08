package com.example.domain;

public class Paper {
	private String namePaper;
	private String description;
	
	public String getNamePaper() {
		return namePaper;
	}
	public void setNamePaper(String nomePapel) {
		this.namePaper = nomePapel;
	}

	public void setResponsabilidaes(String description) {
		this.description = description;
	}
	public Paper(String nomePapel, String description) {
		super();
		this.namePaper = nomePapel;
	
	}
	public Paper() {
		
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}
