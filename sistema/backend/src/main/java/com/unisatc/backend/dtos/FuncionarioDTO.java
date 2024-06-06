package com.unisatc.backend.dtos;

public record FuncionarioDTO(
    Integer id,
    String nome,
    String sobrenome,
    String cpf,
    String contato
) {
    
}
