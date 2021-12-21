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

import com.godev.restaurantegodev.dto.PedidoDTO;
import com.godev.restaurantegodev.model.Pedido;
import com.godev.restaurantegodev.service.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoResources {

	@Autowired 
	private PedidoService service;
	
	@PostMapping
	public ResponseEntity<Pedido> addRestaurante(@RequestBody Pedido pedido){
		
		Pedido newPedido = service.addPedido(pedido);
		return new ResponseEntity<>(newPedido, HttpStatus.CREATED);
	}
	
	@PutMapping()
	public ResponseEntity<Pedido> updatePedido(@RequestBody Pedido pedido){
		Pedido newPedido = service.updatePedido(pedido);
		return new ResponseEntity<>(newPedido, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Pedido> getById(@PathVariable("id") Long id){
		Pedido pedido = service.GetById(id);
		return new ResponseEntity<>(pedido, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Pedido>> findAll(){
		List<Pedido> pedido = service.findAll();
		return new ResponseEntity<>(pedido, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id){
		service.deletePedido(id);
	}
	
	@PostMapping("/efetuarPedido")
	public ResponseEntity<Pedido> efetuarPedido(@RequestBody PedidoDTO dto){
		
		
		Pedido pedido = service.efetuarPedido(dto);
		
		return new ResponseEntity<>(pedido, HttpStatus.CREATED);
	}
	
}
