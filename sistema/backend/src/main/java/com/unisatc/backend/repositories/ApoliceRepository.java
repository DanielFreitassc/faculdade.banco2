package com.unisatc.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unisatc.backend.models.ApoliceEntity;

public interface ApoliceRepository extends JpaRepository<ApoliceEntity,Integer> {
    
}
