package com.unisatc.backend.dtos;

public record FornecedorDTO(
    Integer id,
    String nome,
    String cnpj,
    String descricao
) {
    
}
