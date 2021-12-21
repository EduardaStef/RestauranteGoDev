package com.godev.restaurantegodev.dto;

import java.util.List;

import com.godev.restaurantegodev.model.Contato;
import com.godev.restaurantegodev.model.Endereco;
import com.godev.restaurantegodev.model.Pedido;

public class ClienteDTO {
	
	public String nome;
	
	public String sobrenome;
	
	public String cpf;
	
	public Contato contato;
	
	public Endereco endereco;
	
	public List<Pedido> pedidos;
}
