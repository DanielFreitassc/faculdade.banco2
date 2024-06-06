package com.unisatc.backend.dtos;

public record ClienteDTO(
    Integer id,
    String nome,
    String sobrenome,
    String cpf,
    String contato
) {
    
}
