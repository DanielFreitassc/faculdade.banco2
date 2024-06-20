package com.unisatc.backend.dtos;



import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.unisatc.backend.models.CelularEntity;
import com.unisatc.backend.models.ClienteEntity;
import com.unisatc.backend.models.SinistroEntity;
import com.unisatc.backend.models.TipoPagamentoEntity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PagamentoDTO(
    Integer id,
    ClienteEntity cliente,
    CelularEntity celular,
    @NotNull(message = "Salario não pode ser nulo") 
    @Min(value = 0, message = "Pagamento não pode ser negativo") Double valor,
    TipoPagamentoEntity tipo_pagamento,
    @JsonFormat(pattern = "dd/MM/yyyy") LocalDate data,
    @NotBlank(message = "Descrição não pode ser um campo vazio") String descricao,
    SinistroEntity sinistro

) {
    
}
