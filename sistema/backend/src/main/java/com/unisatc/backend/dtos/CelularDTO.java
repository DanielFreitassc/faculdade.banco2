package com.unisatc.backend.dtos;

import com.unisatc.backend.models.ClienteEntity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CelularDTO(
    Integer id,
    @NotBlank(message = "Modelo não pode ser um campo vazio") String modelo,
    @NotNull(message = "O ano não pode ser nulo") 
    @Min(value = 0, message = "Ano não pode ser um campo negativo") int ano,
    @NotBlank(message = "Marca não pode ser um campo vazio") String marca,
    ClienteEntity cliente
) {
    
}
