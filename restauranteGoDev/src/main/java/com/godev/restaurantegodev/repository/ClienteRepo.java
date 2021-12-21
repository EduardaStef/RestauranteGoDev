package com.godev.restaurantegodev.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.godev.restaurantegodev.model.Cliente;
import com.godev.restaurantegodev.model.Contato;
import com.godev.restaurantegodev.model.Pedido;
import com.godev.restaurantegodev.repository.custom.ClienteRepoCustom;

public interface ClienteRepo extends JpaRepository<Cliente, Long>, ClienteRepoCustom {
	
	@Transactional
	Cliente findClienteById(Long id);
	
	@Transactional
	Cliente findClienteBySobrenomeIgnoreCaseOrderByNome(String sobrenome);
	
	@Transactional
	Contato findClienteByContato(Contato contato);

	@Transactional
	List<Pedido> findClienteByPedidoOrderByNomePedido(Pedido pedido);
	
}
