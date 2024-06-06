package com.unisatc.backend.mappers;

import org.springframework.stereotype.Component;

import com.unisatc.backend.dtos.FornecedorDTO;
import com.unisatc.backend.models.FornecedorEntity;

@Component
public class FornecedorMapper {
    public FornecedorDTO toDto(FornecedorEntity fornecedorEntity) {
        return new FornecedorDTO(
        fornecedorEntity.getId(),
        fornecedorEntity.getNome(),
        fornecedorEntity.getCnpj(),
        fornecedorEntity.getDescricao()
        );
    }

    public FornecedorEntity toEntity(FornecedorDTO fornecedorDTO) {
        return FornecedorEntity.builder()
        .nome(fornecedorDTO.nome())
        .cnpj(fornecedorDTO.cnpj())
        .descricao(fornecedorDTO.descricao())
        .build();
    }
}
