package com.unisatc.backend.mappers;

import org.springframework.stereotype.Component;

import com.unisatc.backend.dtos.TotalTipoPagamentoDTO;
import com.unisatc.backend.models.TotalTipoPagamentoEntity;

@Component
public class TotalTipoPagamentoMapper {
   public TotalTipoPagamentoDTO toDto(TotalTipoPagamentoEntity totalTipoPagamentoEntity) {
    return new TotalTipoPagamentoDTO(
    totalTipoPagamentoEntity.getId(),
    totalTipoPagamentoEntity.getTipo_pagamento(),
    totalTipoPagamentoEntity.getValor()
    );
   }

   public TotalTipoPagamentoEntity toEntity(TotalTipoPagamentoDTO totalTipoPagamentoDTO) {
    return TotalTipoPagamentoEntity.builder()
    .tipo_pagamento(totalTipoPagamentoDTO.tipo_pagamento())
    .valor(totalTipoPagamentoDTO.valor())
    .build();
   }
}
