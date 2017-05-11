package br.fpu.taw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.fpu.taw.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	@Query("from Usuario where email=?")
	public Usuario findByEmail(String email);
}
