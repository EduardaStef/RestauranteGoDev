package com.godev.restaurantegodev.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.godev.restaurantegodev.model.Pedido;
import com.godev.restaurantegodev.model.Restaurante;

public interface PedidoRepo extends JpaRepository<Pedido, Long>{
	
	@Transactional
	Pedido findPedidoById(Long id);

	@Transactional
	List<Pedido> findByRestaurante(Restaurante restaurante);
	
}
