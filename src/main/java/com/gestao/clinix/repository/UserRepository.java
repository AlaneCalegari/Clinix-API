package com.gestao.clinix.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.gestao.clinix.entity.Users;


public interface UserRepository extends JpaRepository<Users, Long> {
	
	Optional<Users> findByUsuario(String usuario);

}
