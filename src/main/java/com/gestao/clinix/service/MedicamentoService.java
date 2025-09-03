package com.gestao.clinix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestao.clinix.dto.MedicamentoDTO;
import com.gestao.clinix.entity.Medicamento;
import com.gestao.clinix.repository.MedicamentoRepository;



@Service
public class MedicamentoService {
	
	@Autowired
	private MedicamentoRepository medicamentoRepository;	
	
	public List<MedicamentoDTO> getAll(){
		List<Medicamento> medicamentoList = getMedicamentoRepository().findAll();
		List<MedicamentoDTO> livroListDTO = medicamentoList.stream().map(medicamento -> MedicamentoDTO.convertToDTO(medicamento)).toList();
		return livroListDTO;
	}

	
	
	public MedicamentoRepository getMedicamentoRepository() {
		return medicamentoRepository;
	}


}
