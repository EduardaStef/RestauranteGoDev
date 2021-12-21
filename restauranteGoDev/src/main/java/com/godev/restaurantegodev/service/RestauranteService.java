package com.godev.restaurantegodev.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godev.restaurantegodev.model.Restaurante;
import com.godev.restaurantegodev.repository.RestauranteRepo;

@Service
@Transactional
public class RestauranteService {
	
	@Autowired
	private RestauranteRepo repo;


	public Restaurante addRestaurante(Restaurante restaurante) {
		return repo.save(restaurante);
	}
	
	public Restaurante updateRestaurante(Restaurante restaurante) {
		return repo.save(restaurante);
	}
	
	public List<Restaurante> findAll() {
		return repo.findAll();
	}
	
	public Restaurante findById(Long id) {
		return repo.getById(id);
	}
	
	public void deletar(Long id) {
		 repo.deleteById(id);
	}
	
}
