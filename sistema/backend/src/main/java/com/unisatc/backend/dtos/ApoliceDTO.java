package com.unisatc.backend.dtos;

import com.unisatc.backend.models.ClienteEntity;

public record ApoliceDTO(
    Integer id, 
    ClienteEntity cliente
) {
    
}
