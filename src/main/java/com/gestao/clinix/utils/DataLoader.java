package com.gestao.clinix.utils;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.gestao.clinix.entity.Users;
import com.gestao.clinix.repository.UserRepository;

@Component
public class DataLoader implements CommandLineRunner {

	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;

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
		admin.setUsuario("rafael.zanella@clinix.com"); // seu e-mail corporativo
		admin.setSenha(passwordEncoder.encode("123456")); // senha de 6 dígitos
		admin.setRole("ADMIN");
		admin.setAtivo(true);

		userRepository.save(admin);

		System.out.println("Usuário admin criado: " + admin.getUsuario());
	}
}
