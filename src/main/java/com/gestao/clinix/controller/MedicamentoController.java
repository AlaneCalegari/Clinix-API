package com.gestao.clinix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gestao.clinix.dto.MedicamentoDTO;
import com.gestao.clinix.service.MedicamentoService;

@RestController
@RequestMapping("/medicamentos")
public class MedicamentoController {
	
	@Autowired
	private MedicamentoService medicamentoService;
	
	
	@GetMapping()
	public ResponseEntity<?> getAll() {
		try {
			List<MedicamentoDTO> medicamentosDTO = getMedicamentoService().getAll();
			return ResponseEntity.status(HttpStatus.OK).body(medicamentosDTO);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}		
	}
	
	@GetMapping("/teste")
	public String teste() {
		return "API está rodando";
	}

	
	
	public MedicamentoService getMedicamentoService() {
		return medicamentoService;
	}

}
