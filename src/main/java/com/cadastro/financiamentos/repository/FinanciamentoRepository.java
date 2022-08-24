package com.cadastro.financiamentos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastro.financiamentos.models.FinanciamentoEntity;
import com.cadastro.financiamentos.models.ParcelaEntity;


public interface FinanciamentoRepository extends JpaRepository<FinanciamentoEntity, Integer> {
	@Override
	default Optional<FinanciamentoEntity> findById(Integer id) {

		return null;
	} 
	
	

}

