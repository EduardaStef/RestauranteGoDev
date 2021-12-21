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

import com.godev.restaurantegodev.model.Restaurante;
import com.godev.restaurantegodev.service.RestauranteService;

@RestController
@RequestMapping("/restaurante")
public class RestauranteResources {
	
	@Autowired
	private RestauranteService service;
	
	@PostMapping
	public ResponseEntity<Restaurante> addRestaurante(@RequestBody Restaurante restaurante){
		Restaurante newRestaurante = service.addRestaurante(restaurante);
		return new ResponseEntity<>(newRestaurante, HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Restaurante> updateRestaurante(@RequestBody Restaurante restaurante){
		Restaurante newRestaurante = service.updateRestaurante(restaurante);
		return new ResponseEntity<>(newRestaurante, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Restaurante>> findAll(){
		List<Restaurante> restaurantes = service.findAll();
		return new ResponseEntity<>(restaurantes, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Restaurante> findById(@PathVariable("id") Long id){
		Restaurante restaurante = service.findById(id);
		return new ResponseEntity<>(restaurante, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public void deletar (@PathVariable("id") Long id) {
		service.deletar(id);
	}

}
