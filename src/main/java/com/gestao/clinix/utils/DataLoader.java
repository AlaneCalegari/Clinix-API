package com.gestao.clinix.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.gestao.clinix.entity.Users;
import com.gestao.clinix.repository.UserRepository;

@Component
public class DataLoader implements CommandLineRunner {

	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;

	@Value("${admin.email:admin@clinix.com}")
	private String adminEmail;

	@Value("${admin.password:123456}")
	private String adminPassword;

	@Value("${admin.name:Administrador}")
	private String adminName;

	public DataLoader(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public void run(String... args) throws Exception {
		// Limpa todos os usuários existentes
		userRepository.deleteAll();

		// Cria apenas o admin
		Users admin = new Users();
		admin.setNome(adminName);
		admin.setUsuario(adminEmail);
		admin.setSenha(passwordEncoder.encode(adminPassword));
		admin.setRole("ADMIN");
		admin.setAtivo(true);

		userRepository.save(admin);

		System.out.println("Usuário admin criado: " + admin.getUsuario());
	}
}
