package com.unisatc.backend.dtos;

import jakarta.validation.constraints.NotBlank;

public record ClienteDTO(
    Integer id,
    @NotBlank String nome,
    String sobrenome,
    String cpf,
    String contato
) {
    
}
