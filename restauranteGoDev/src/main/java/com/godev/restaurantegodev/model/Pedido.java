package com.godev.restaurantegodev.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Pedido implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private LocalDate dataPedido;
	
	@ManyToOne
	private Cliente cliente;
	
	@OneToOne
	private Restaurante restaurante;
	
	@OneToOne
	private Produto produto;
	
	public Pedido(LocalDate data, Cliente cliente, Restaurante restaurante, Produto produto) {
		super();
		this.cliente = cliente;
		this.restaurante = restaurante;
		this.produto = produto;
		this.dataPedido = data;
	}
	
	public Pedido(Cliente cliente, Restaurante restaurante, Produto produto) {
		super();
		this.cliente = cliente;
		this.restaurante = restaurante;
		this.produto = produto;
	}
	
	public Pedido() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Restaurante getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	

}
