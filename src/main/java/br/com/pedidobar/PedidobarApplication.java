package br.com.pedidobar;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.pedidobar.domain.Categoria;
import br.com.pedidobar.repositories.CategoriaRepository;

@SpringBootApplication
public class PedidobarApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(PedidobarApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {		
		Categoria categoria1 = new Categoria(null, "Alimentos");
		Categoria categoria2 = new Categoria(null, "Bebidas");
		
		List<Categoria> catLista = new ArrayList<Categoria>();
		catLista.add(categoria1);
		catLista.add(categoria2);
		
		categoriaRepo.saveAll(catLista);
	}
	
	
}

