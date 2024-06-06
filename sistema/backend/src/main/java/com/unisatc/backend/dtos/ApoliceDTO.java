package com.unisatc.backend.dtos;

import java.security.Timestamp;

import com.unisatc.backend.models.CelularEntity;
import com.unisatc.backend.models.ClienteEntity;
import com.unisatc.backend.models.FuncionarioEntity;

public record ApoliceDTO(
    Integer id, 
    ClienteEntity cliente,
    Timestamp inicio,
    Timestamp fim,
    Double valor,
    CelularEntity celular,
    FuncionarioEntity funcionario
) {
    
}
