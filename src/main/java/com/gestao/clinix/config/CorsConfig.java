package com.gestao.clinix.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
public class CorsConfig {

	@Bean
	public CorsConfigurationSource corsConfigurationSource() {
		CorsConfiguration config = new CorsConfiguration();

		// Permite qualquer origem LOCALHOST (Windows ou Linux), independente da porta
		config.addAllowedOriginPattern("http://localhost:*");
		config.addAllowedOriginPattern("http://127.0.0.1:*");
		config.addAllowedOriginPattern("http://0.0.0.0:*");
		config.addAllowedOriginPattern("http://192.168.*.*:*"); // se usar rede local

		config.addAllowedHeader("*");
		config.addAllowedMethod("*");
		config.setAllowCredentials(true);

		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", config);

		return source;
	}
}
