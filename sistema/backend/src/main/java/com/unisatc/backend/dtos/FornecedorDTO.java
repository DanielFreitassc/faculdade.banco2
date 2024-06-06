package com.unisatc.backend.dtos;

import jakarta.validation.constraints.NotBlank;

public record FornecedorDTO(
    Integer id,
    @NotBlank(message = "Nome não pode ser um campo vazio") String nome,
    @NotBlank(message = "CNPJ não pode ser um campo vazio") String cnpj,
    @NotBlank(message = "Descrição não pode ser um campo vazio") String descricao
) {
    
}
