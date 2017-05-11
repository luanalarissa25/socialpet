package br.fpu.taw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.fpu.taw.model.Usuario;
import br.fpu.taw.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	public Usuario buscar(Long id) {
		return usuarioRepository.findOne(id);
	}
	
	public List<Usuario> buscarTodos() {
		return usuarioRepository.findAll();
	}
	
	public Usuario salvar(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public void apagar(Usuario usuario) {
		usuarioRepository.delete(usuario);
	}
	
	public Usuario buscarPorEmail(String email) {
		return usuarioRepository.findByEmail(email);
	}

}
