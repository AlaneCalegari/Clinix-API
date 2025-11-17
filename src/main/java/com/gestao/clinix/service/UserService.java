package com.gestao.clinix.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.gestao.clinix.dto.UserCreateRequest;
import com.gestao.clinix.dto.UserResponse;
import com.gestao.clinix.entity.Users;
import com.gestao.clinix.repository.UserRepository;

@Service
public class UserService {

	private final UserRepository repo;
	private final PasswordEncoder encoder;
	private final ModelMapper mapper;

	public UserService(UserRepository repo, PasswordEncoder encoder, ModelMapper mapper) {
		this.repo = repo;
		this.encoder = encoder;
		this.mapper = mapper;
	}

	public UserResponse create(UserCreateRequest dto) {
		// checa se já existe usuário com mesmo e-mail
		repo.findByUsuario(dto.getUsuario()).ifPresent(u -> {
			throw new IllegalArgumentException("Usuário já cadastrado com esse e-mail");
		});

		Users u = new Users();
		u.setUsuario(dto.getUsuario());
		u.setSenha(encoder.encode(dto.getSenha())); // salva hash
		u.setRole(dto.getRole());
		u.setAtivo(true);

		Users saved = repo.save(u);
		return toResponse(saved);
	}

	public UserResponse update(Long id, UserCreateRequest dto) {
		Users u = repo.findById(id).orElseThrow(() -> new IllegalArgumentException("Usuário não encontrado"));
		// Se o e-mail mudar, verifica duplicidade
		if (!u.getUsuario().equalsIgnoreCase(dto.getUsuario())) {
			repo.findByUsuario(dto.getUsuario()).ifPresent(other -> {
				throw new IllegalArgumentException("Outro usuário já utiliza esse e-mail");
			});
			u.setUsuario(dto.getUsuario());
		}

		// Atualiza a senha (sempre codifica)
		u.setSenha(encoder.encode(dto.getSenha()));
		u.setRole(dto.getRole());

		Users saved = repo.save(u);
		return toResponse(saved);
	}

	public UserResponse findById(Long id) {
		Users u = repo.findById(id).orElseThrow(() -> new IllegalArgumentException("Usuário não encontrado"));
		return toResponse(u);
	}

	public List<UserResponse> findAll() {
		return repo.findAll().stream().map(this::toResponse).collect(Collectors.toList());
	}

	public void delete(Long id) {
		if (!repo.existsById(id)) {
			throw new IllegalArgumentException("Usuário não encontrado");
		}
		repo.deleteById(id);
	}

	/**
	 * Helper: converte entidade para DTO de resposta
	 */
	private UserResponse toResponse(Users u) {
		UserResponse r = mapper.map(u, UserResponse.class);
		// garantir que senha não apareça (ModelMapper não mapeia senha para
		// UserResponse)
		return r;
	}
}