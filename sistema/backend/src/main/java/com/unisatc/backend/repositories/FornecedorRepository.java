package com.unisatc.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unisatc.backend.models.FornecedorEntity;

public interface FornecedorRepository extends JpaRepository<FornecedorEntity, Integer> {
    
}
