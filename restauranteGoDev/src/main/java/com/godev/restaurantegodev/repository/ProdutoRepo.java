package com.godev.restaurantegodev.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.godev.restaurantegodev.model.Produto;

public interface ProdutoRepo extends JpaRepository<Produto, Long>{
	
	@Transactional
	Produto findProdutoById(Long id);

	@Transactional
	Produto findByProdutoNomeIgnoreCase(String produtoNome);
	
	@Transactional
	Produto findByPrecoLessThanEqual(Double preco);
	
	@Transactional
	Produto findByPrecoGreaterThanEqual(Double preco);
}
