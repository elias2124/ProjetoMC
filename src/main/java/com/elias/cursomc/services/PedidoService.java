package com.elias.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elias.cursomc.domain.Pedido;
import com.elias.cursomc.repositories.PedidoRepository;
import com.elias.cursomc.services.excepitions.ObjectNotFoundExcepition;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundExcepition(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
		}


}
