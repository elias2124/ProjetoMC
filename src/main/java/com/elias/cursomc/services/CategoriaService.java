package com.elias.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elias.cursomc.domain.Categoria;
import com.elias.cursomc.repositories.CategoriaRepository;
import com.elias.cursomc.services.excepitions.ObjectNotFoundExcepition;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundExcepition(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
		}


}
