package com.unisatc.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unisatc.backend.models.PagamentoEntity;

public interface PagamentoRepository extends JpaRepository<PagamentoEntity, Integer> {
    
}
