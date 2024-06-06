package com.unisatc.backend.mappers;

import org.springframework.stereotype.Component;
import com.unisatc.backend.dtos.FuncionarioDTO;
import com.unisatc.backend.models.FuncionarioEntity;

@Component
public class FuncionarioMapper {
    public FuncionarioDTO toDto(FuncionarioEntity funcionarioEntity) {
        return new FuncionarioDTO(
        funcionarioEntity.getId(),
        funcionarioEntity.getNome(),
        funcionarioEntity.getSobrenome(),
        funcionarioEntity.getCpf(),
        funcionarioEntity.getContato(),
        funcionarioEntity.getSalario(),
        funcionarioEntity.getFuncao()
        );
    }

    public FuncionarioEntity toEntity(FuncionarioDTO funcionarioDTO) {
        return FuncionarioEntity.builder()
        .nome(funcionarioDTO.nome())
        .sobrenome(funcionarioDTO.sobrenome())
        .cpf(funcionarioDTO.cpf())
        .contato(funcionarioDTO.contato())
        .salario(funcionarioDTO.salario())
        .funcao(funcionarioDTO.funcao())
        .build();
    }
}
