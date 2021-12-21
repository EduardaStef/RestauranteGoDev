package com.godev.restaurantegodev.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Produto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String produtoNome;

	@Column
	private double preco;

	public Produto(String produtoNome, double preco) {
		super();
		this.produtoNome = produtoNome;
		this.preco = preco;
	}
	
	
	@Deprecated
	public Produto() {}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProdutoNome() {
		return produtoNome;
	}

	public void setProdutoNome(String produtoNome) {
		this.produtoNome = produtoNome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
