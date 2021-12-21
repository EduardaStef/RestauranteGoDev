package com.godev.restaurantegodev.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godev.restaurantegodev.model.Cliente;
import com.godev.restaurantegodev.repository.ClienteRepo;

@Service
@Transactional
public class ClienteService {

	@Autowired
	private ClienteRepo repo;



	public Cliente addCliente(Cliente cliente) {
		return repo.save(cliente);
	}

	public Cliente updateCliente(Cliente cliente) {
		return repo.save(cliente);
	}

	public List<Cliente> findClientes() {
		return repo.buscarTodosClientesQueryDsl();
	}

	public Cliente findById(Long id) {
		return repo.getById(id);
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}

}
