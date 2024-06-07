package com.unisatc.backend.mappers;

import org.springframework.stereotype.Component;

import com.unisatc.backend.dtos.TipoPagamentoDTO;
import com.unisatc.backend.models.TipoPagamentoEntity;

@Component
public class TipoPagamentoMapper {
    public TipoPagamentoDTO toDto(TipoPagamentoEntity tipoPagamentoEntity) {
        return new TipoPagamentoDTO(
        tipoPagamentoEntity.getId(),
        tipoPagamentoEntity.getDescricao());
    }

    public TipoPagamentoEntity toEntity(TipoPagamentoDTO tipoPagamentoDTO) {
        return TipoPagamentoEntity.builder()
        .descricao(tipoPagamentoDTO.descricao())
        .build();
    }
}
