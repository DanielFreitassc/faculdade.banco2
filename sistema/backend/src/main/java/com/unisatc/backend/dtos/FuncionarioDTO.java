package com.unisatc.backend.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record FuncionarioDTO(
    Integer id,
    @NotBlank(message = "Nome não pode ser um campo vazio") String nome,
    @NotBlank(message = "Sobrnome não pode ser um campo vazio") String sobrenome,
    @NotBlank(message = "CPF não pode ser um campo vazio") String cpf,
    String contato,
    @NotNull(message = "Salario não pode ser nulo") 
    @Min(value = 0, message = "Salário não pode ser negativo") Double salario,
    @NotBlank(message = "Função não pode ser um campo vazio") String funcao

) {
    
}
