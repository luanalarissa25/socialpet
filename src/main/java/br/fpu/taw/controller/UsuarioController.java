package br.fpu.taw.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.fpu.taw.model.Usuario;
import br.fpu.taw.service.UsuarioService;

@RestController
@RequestMapping(value="/api/v1/usuario")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Collection<Usuario>> listar() {
		return new ResponseEntity<>(usuarioService.buscarTodos(), HttpStatus.OK);
	}
}
