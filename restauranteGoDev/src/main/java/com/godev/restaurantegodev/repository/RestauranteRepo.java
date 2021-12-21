package com.godev.restaurantegodev.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.godev.restaurantegodev.enums.TipoRestaurante;
import com.godev.restaurantegodev.model.Restaurante;

public interface RestauranteRepo extends JpaRepository<Restaurante, Long> {

	@Transactional
	Restaurante findRestauranteById (Long id);
	
	@Transactional
	List<Restaurante> findByTipoRestauranteOrderByDesc(TipoRestaurante tipoRestaurante);
	
	
}
