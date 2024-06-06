package com.unisatc.backend.dtos;

import jakarta.validation.constraints.NotBlank;

public record TipoPagamentoDTO(
    Integer id,
    @NotBlank(message = "Descrição não pode ser um campo vazio") String descricao
) {
    
}
