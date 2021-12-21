package com.godev.restaurantegodev.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.godev.restaurantegodev.enums.TipoRestaurante;

@Entity
@Table
public class Restaurante implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String nome;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private TipoRestaurante tipo;

	@OneToOne(cascade = CascadeType.ALL)
	private Contato contato;

	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;

	public Restaurante(String nome, TipoRestaurante tipo, Contato contato, Endereco endereco) {

		super();
		this.nome = nome;
		this.tipo = tipo;
		this.contato = contato;
		this.endereco = endereco;
	}

	@Deprecated
	public Restaurante() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoRestaurante getTipo() {
		return tipo;
	}

	public void setTipo(TipoRestaurante tipo) {
		this.tipo = tipo;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
