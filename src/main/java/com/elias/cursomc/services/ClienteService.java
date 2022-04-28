package com.elias.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elias.cursomc.domain.Cliente;
import com.elias.cursomc.repositories.ClienteRepository;
import com.elias.cursomc.services.excepitions.ObjectNotFoundExcepition;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundExcepition(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
		}


}
