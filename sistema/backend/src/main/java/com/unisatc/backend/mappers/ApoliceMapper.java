package com.unisatc.backend.mappers;

import org.springframework.stereotype.Component;

import com.unisatc.backend.dtos.ApoliceDTO;
import com.unisatc.backend.models.ApoliceEntity;

@Component
public class ApoliceMapper { 
    public ApoliceDTO toDto(ApoliceEntity apoliceEntity) {
        return new ApoliceDTO(
        apoliceEntity.getId(),
        apoliceEntity.getCliente(),
        apoliceEntity.getInicio(),
        apoliceEntity.getFim(),
        apoliceEntity.getValor(),
        apoliceEntity.getCelular(),
        apoliceEntity.getFuncionario()
        );
    }

    public ApoliceEntity toEntity(ApoliceDTO apoliceDTO) {
        return ApoliceEntity.builder()
        .cliente(apoliceDTO.cliente())
        .inicio(apoliceDTO.inicio())
        .fim(apoliceDTO.fim())
        .valor(apoliceDTO.valor())
        .celular(apoliceDTO.celular())
        .funcionario(apoliceDTO.funcionario())
        .build();
    }
}
