package com.example.domain;

public class Usuario  {
public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
public Papel[] getPapeis() {
		return papeis;
	}
	public void setPapeis(Papel[] papeis) {
		this.papeis = papeis;
	}
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

private Pessoa pessoa;
private Papel[] papeis;
private String tipoUsuario;

}
