package com.unisatc.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unisatc.backend.models.TipoPagamentoEntity;

public interface TipoPagamentoRepository extends JpaRepository<TipoPagamentoEntity, Integer> {
    
}
