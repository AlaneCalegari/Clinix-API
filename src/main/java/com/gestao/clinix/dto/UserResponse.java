package com.gestao.clinix.dto;

/**
 * DTO de resposta para operações com usuário. Não contém a senha.
 */
public class UserResponse {

	private Long id;
	private String usuario;
	private String role;
	private boolean ativo;

	// getters / setters
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
