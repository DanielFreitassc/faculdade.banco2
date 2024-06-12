package com.unisatc.backend.dtos;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.unisatc.backend.models.CelularEntity;
import com.unisatc.backend.models.ClienteEntity;
import com.unisatc.backend.models.FuncionarioEntity;

public record ApoliceDTO(
    Integer id, 
    ClienteEntity cliente,
    @JsonFormat(pattern = "dd/MM/yyyy")
    LocalDate inicio,
    @JsonFormat(pattern = "dd/MM/yyyy")
    LocalDate fim,
    Double valor,
    CelularEntity celular,
    FuncionarioEntity funcionario
) {
    
}
