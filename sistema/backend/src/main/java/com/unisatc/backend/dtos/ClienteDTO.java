package com.unisatc.backend.dtos;

import jakarta.validation.constraints.NotBlank;

public record ClienteDTO(
    Integer id,
    @NotBlank(message = "Nome não pode ser um campo vazio") String nome,
    @NotBlank(message = "Sobrenome não pode ser um campo vazio") String sobrenome,
    @NotBlank(message = "CPF não pode ser um campo vazio") String cpf,
    String contato
) {
    
}
