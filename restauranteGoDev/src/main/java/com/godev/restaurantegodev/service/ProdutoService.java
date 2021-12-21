package com.godev.restaurantegodev.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godev.restaurantegodev.model.Produto;
import com.godev.restaurantegodev.repository.ProdutoRepo;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepo repo;
	
	public Produto addProduto(Produto produto) {
		return repo.save(produto);
	}
	
	public Produto updateProduto(Produto produto) {
		return repo.save(produto);
	}
	
	public List<Produto> findAll(){
		return repo.findAll();
	}
	
	public Produto getById(Long id) {
		return repo.getById(id);
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	

}
