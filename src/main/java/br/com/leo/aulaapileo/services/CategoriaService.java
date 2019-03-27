package br.com.leo.aulaapileo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.leo.aulaapileo.domain.Categoria;
import br.com.leo.aulaapileo.repositories.CategoriaRepository;
import br.com.leo.aulaapileo.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = categoriaRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id +
				"Tipo: " + Categoria.class.getName()
				));
	}
	
	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return categoriaRepository.save(obj);
	}
	
	public Categoria update(Categoria obj) {
		find(obj.getId());
		return categoriaRepository.save(obj);
	}
	
	public void delete(Integer id) {
		find(id);
		categoriaRepository.deleteById(id);
	}
}
