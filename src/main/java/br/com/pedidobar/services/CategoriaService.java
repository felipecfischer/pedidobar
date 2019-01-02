package br.com.pedidobar.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pedidobar.domain.Categoria;
import br.com.pedidobar.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repoCategoria;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> categoria = repoCategoria.findById(id);
		return categoria.orElse(null);
	}
}
