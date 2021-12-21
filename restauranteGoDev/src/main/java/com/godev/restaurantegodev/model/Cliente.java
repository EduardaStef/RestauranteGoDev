package com.godev.restaurantegodev.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Cliente implements Serializable{
	
	private static final Long Serializable = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String sobrenome;
	
	@Column(nullable = false, unique = true)
	private String cpf;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	private Contato contato;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	private Endereco endereco;
	
	@OneToMany
	private List<Pedido> pedidos;
	
	public Cliente(String nome, String sobrenome, String cpf, Contato contato, Endereco endereco) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.contato = contato;
		this.endereco = endereco;
	}
	
	@Deprecated
	public Cliente() {}

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

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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
