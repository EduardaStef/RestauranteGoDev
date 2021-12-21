package com.godev.restaurantegodev.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.godev.restaurantegodev.model.Produto;
import com.godev.restaurantegodev.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoResource {

	@Autowired
	private ProdutoService service;
	
	@PostMapping
	public ResponseEntity<Produto> addProduto(@RequestBody Produto produto){
		Produto newProduto = service.addProduto(produto);
		return new ResponseEntity<>(newProduto, HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Produto> updateProduto(@RequestBody Produto produto){
		Produto newProduto = service.updateProduto(produto);
		return new ResponseEntity<>(newProduto, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> getById(@PathVariable("id") Long id){
		Produto produto = service.getById(id);
		return new ResponseEntity<>(produto, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Produto>> findAll(){
		List<Produto> produto = service.findAll();
		return new ResponseEntity<>(produto, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
	}


}
