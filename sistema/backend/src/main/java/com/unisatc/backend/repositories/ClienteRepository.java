package com.unisatc.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unisatc.backend.models.ClienteEntity;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer> {
    
}
