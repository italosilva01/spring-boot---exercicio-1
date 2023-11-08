package com.example.repositories;

import java.util.ArrayList;
import java.util.List;

import com.example.domain.User;

public class UsuarioRepository {

	private static List<User> usuarios = new ArrayList<User>();
	
	public static List<User> getUsuarios(){
		return usuarios;
	}
	public static User addUsuario (User u) {
		usuarios.add(u);
		return u;
	}
}
