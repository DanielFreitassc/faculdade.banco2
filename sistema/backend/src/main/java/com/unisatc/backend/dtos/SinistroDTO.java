package com.unisatc.backend.dtos;

import java.sql.Time;
import java.time.LocalDate;

import com.unisatc.backend.models.CelularEntity;
import com.unisatc.backend.models.ClienteEntity;
import com.unisatc.backend.models.FornecedorEntity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record SinistroDTO(
    Integer id,
    @NotNull(message = "Data não pode ser nula") LocalDate data,
    ClienteEntity cliente,
    CelularEntity celular,
    @NotBlank(message = "Local não pode ser um campo vazio") String local,
    Time horario,
    FornecedorEntity fornecedor,
    String descricao
) {
    
}
