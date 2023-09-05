package com.example.repositories;

import java.util.ArrayList;
import java.util.List;

import com.example.domain.Usuario;

public class UsuarioRepository {

	private static List<Usuario> usuarios = new ArrayList<Usuario>();
	
	public static List<Usuario> getUsuarios(){
		return usuarios;
	}
	public static Usuario addUsuario (Usuario u) {
		usuarios.add(u);
		return u;
	}
}
