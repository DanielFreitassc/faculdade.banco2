package com.unisatc.backend.dtos;

import java.time.Instant;

import com.unisatc.backend.models.CelularEntity;
import com.unisatc.backend.models.ClienteEntity;
import com.unisatc.backend.models.FuncionarioEntity;

public record ApoliceDTO(
    Integer id, 
    ClienteEntity cliente,
    Instant inicio,
    Instant fim,
    Double valor,
    CelularEntity celular,
    FuncionarioEntity funcionario
) {
    
}
