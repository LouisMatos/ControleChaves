package br.com.luismatos.dao.service;

import br.com.luismatos.implementation.UsuarioDAOImplementation;
import br.com.luismatos.model.Usuario;

public class UsuarioService {

	private UsuarioDAOImplementation dao = new UsuarioDAOImplementation();
	private Usuario usuario = new Usuario();
	
	public Usuario existeUsuario(Usuario usuario) {
		return dao.existeUsuario(usuario);
	}
	
	
}
