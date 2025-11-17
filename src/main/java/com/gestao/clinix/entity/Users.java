package com.gestao.clinix.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users") // ou "USERS" se você tiver criado com aspas; mas provavelmente 'users'
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// Mapeia para a coluna 'username' existente no banco
	@Column(name = "username", nullable = false, unique = true, length = 255)
	private String usuario;

	// Mapeia para a coluna 'password' existente no banco
	@Column(name = "password", nullable = false, length = 255)
	private String senha;

	@Column(name = "role", nullable = false, length = 50)
	private String role;

	// Se no banco já existe a coluna 'ativo' então mapeamos para ela
	@Column(name = "ativo", nullable = false)
	private boolean ativo = true;

	// getters e setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
}