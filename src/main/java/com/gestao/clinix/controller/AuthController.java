package com.gestao.clinix.controller;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestao.clinix.config.JwtService;
import com.gestao.clinix.dto.LoginRequest;
import com.gestao.clinix.dto.LoginResponse;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/auth")
public class AuthController {

	private final AuthenticationManager authenticationManager;
	private final JwtService jwtService;

	public AuthController(AuthenticationManager authenticationManager, JwtService jwtService) {
		this.authenticationManager = authenticationManager;
		this.jwtService = jwtService;
	}

	@PostMapping("/login")
	public LoginResponse login(@Valid @RequestBody LoginRequest request) {
		try {
			// Tenta autenticar o usuário
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));

			// Se autenticou, gera token JWT
			String token = jwtService.generateToken(request.getUsername());
			return new LoginResponse(token);

		} catch (AuthenticationException e) {
			// Lança exceção com mensagem clara
			throw new RuntimeException("E-mail ou senha incorretos. Tente novamente.");
		}
	}
}