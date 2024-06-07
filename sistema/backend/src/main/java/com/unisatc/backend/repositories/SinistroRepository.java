package com.unisatc.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unisatc.backend.models.SinistroEntity;

public interface SinistroRepository extends JpaRepository<SinistroEntity, Integer> {
    
}
