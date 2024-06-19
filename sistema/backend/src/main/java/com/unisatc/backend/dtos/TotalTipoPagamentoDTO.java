package com.unisatc.backend.dtos;

import java.math.BigDecimal;

import com.unisatc.backend.models.TipoPagamentoEntity;

public record TotalTipoPagamentoDTO(
    Integer id,
    TipoPagamentoEntity tipo_pagamento,
    BigDecimal valor
) {
    
}
