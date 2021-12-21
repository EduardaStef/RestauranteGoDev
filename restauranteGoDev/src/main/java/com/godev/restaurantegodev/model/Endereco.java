package com.godev.restaurantegodev.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class Endereco implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	@NotNull(message = "A rua não pode ser nula!")
	private String rua;

	@Column(nullable = false)
	@NotNull(message = "O numero não pode ser nulo!")
	private int numero;

	@Column(nullable = true)
	@NotNull(message = "O logradouro não pode ser nulo!")
	private String logradouro;

	public Endereco(String rua, int numero, String logradouro) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.logradouro = logradouro;
	}
	
	@Deprecated
	public Endereco() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

}
