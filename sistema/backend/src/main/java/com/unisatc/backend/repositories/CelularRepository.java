package com.unisatc.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unisatc.backend.models.CelularEntity;

public interface CelularRepository extends JpaRepository<CelularEntity, Integer> {
    
}
