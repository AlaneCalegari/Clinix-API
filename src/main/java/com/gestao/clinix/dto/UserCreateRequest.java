package com.gestao.clinix.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * DTO usado para criação/atualização de usuário. - Valida email apenas do
 * domínio @clinix.com - Valida senha como exatamente 6 dígitos numéricos
 */
public class UserCreateRequest {

	@NotBlank(message = "O e-mail é obrigatório.")
	@Email(message = "Formato de e-mail inválido.")
	@Pattern(regexp = "^[A-Za-z0-9._%+-]+@clinix\\.com$", message = "O e-mail deve pertencer ao domínio @clinix.com")
	private String usuario;

	@NotBlank(message = "A senha é obrigatória.")
	@Pattern(regexp = "\\d{6}", message = "A senha deve conter exatamente 6 números.")
	private String senha; // plain-text aqui; será codificada antes de persistir

	@NotBlank(message = "A role é obrigatória.")
	@Size(max = 50)
	private String role; // "ADMIN" ou "USER"

	// getters / setters
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
}