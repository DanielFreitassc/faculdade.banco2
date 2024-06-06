package com.unisatc.backend.mappers;

import org.springframework.stereotype.Component;

import com.unisatc.backend.dtos.PagamentoDTO;
import com.unisatc.backend.models.PagamentoEntity;

@Component
public class PagamentoMapper {
    public PagamentoDTO toDto(PagamentoEntity pagamentoEntity) {
        return new PagamentoDTO(
        pagamentoEntity.getId(),
        pagamentoEntity.getCliente(),
        pagamentoEntity.getCelular(),
        pagamentoEntity.getValor(),
        pagamentoEntity.getTipo_pagamento(),
        pagamentoEntity.getData(),
        pagamentoEntity.getDescricao()
        );
    }
    
    public PagamentoEntity toEntity(PagamentoDTO pagamentoDTO) {
        return PagamentoEntity.builder()
        .cliente(pagamentoDTO.cliente())
        .celular(pagamentoDTO.celular())
        .valor(pagamentoDTO.valor())
        .tipo_pagamento(pagamentoDTO.tipo_pagamento())
        .data(pagamentoDTO.data())
        .descricao(pagamentoDTO.descricao())
        .build();
    }
}
