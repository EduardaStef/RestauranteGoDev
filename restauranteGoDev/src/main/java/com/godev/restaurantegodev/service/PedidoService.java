package com.godev.restaurantegodev.service;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godev.restaurantegodev.dto.PedidoDTO;
import com.godev.restaurantegodev.model.Cliente;
import com.godev.restaurantegodev.model.Pedido;
import com.godev.restaurantegodev.model.Produto;
import com.godev.restaurantegodev.model.Restaurante;
import com.godev.restaurantegodev.repository.ClienteRepo;
import com.godev.restaurantegodev.repository.PedidoRepo;
import com.godev.restaurantegodev.repository.ProdutoRepo;
import com.godev.restaurantegodev.repository.RestauranteRepo;

@Service
@Transactional
public class PedidoService {

	@Autowired
	private PedidoRepo repo;

	@Autowired
	private ClienteRepo clienteRepo;

	@Autowired
	private RestauranteRepo repoRestaurante;

	@Autowired
	private ProdutoRepo repoProduto;

	public Pedido addPedido(Pedido pedido) {
		return repo.save(pedido);
	};

	public Pedido updatePedido(Pedido pedido) {
		return repo.save(pedido);
	}

	public List<Pedido> findAll() {
		return repo.findAll();
	}

	public Pedido GetById(Long id) {
		return repo.getById(id);
	}

	public void deletePedido(Long id) {
	}
	
	public Pedido efetuarPedido(PedidoDTO dto) {
	
	LocalDate date = LocalDate.now();
	Cliente cliente = clienteRepo.findClienteById(dto.idCliente);
	Restaurante restaurante = repoRestaurante.findRestauranteById(dto.idRestaurante);
	Produto produto = repoProduto.findProdutoById(dto.idProduto); 
		
	Pedido pedido = new Pedido(date, cliente, restaurante, produto);
	
	return repo.save(pedido); 
		
	}
}
