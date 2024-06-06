package com.unisatc.backend.dtos;

import java.security.Timestamp;

import com.unisatc.backend.models.CelularEntity;
import com.unisatc.backend.models.ClienteEntity;
import com.unisatc.backend.models.TipoPagamentoEntity;

public record PagamentoDTO(
    Integer id,
    ClienteEntity cliente,
    CelularEntity celular,
    Double valor,
    TipoPagamentoEntity tipo_pagamento,
    Timestamp data,
    String descricao
) {
    
}
