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

import com.godev.restaurantegodev.model.Cliente;
import com.godev.restaurantegodev.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteResources {

	
	@Autowired
	private ClienteService service;

	
	@PostMapping
	public ResponseEntity<Cliente> addCliente(@RequestBody Cliente cliente){
		
		Cliente newCliente = service.addCliente(cliente);
		return new ResponseEntity<>(newCliente, HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Cliente> updateCliente(@RequestBody Cliente cliente){
		Cliente newCliente = service.updateCliente(cliente);
		return new ResponseEntity<>(newCliente, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Cliente>> findAll(){
		
		List<Cliente> clientes = service.findClientes();
		return new ResponseEntity<>(clientes, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> findById(@PathVariable("id") Long id){
		Cliente cliente = service.findById(id);
		return new ResponseEntity<>(cliente, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id){
		service.delete(id);
		 
		 
	}
	
	
	
	
}
