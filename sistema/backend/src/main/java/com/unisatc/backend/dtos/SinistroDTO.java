package com.unisatc.backend.dtos;

import java.sql.Time;
import java.time.LocalDate;

import com.unisatc.backend.models.CelularEntity;
import com.unisatc.backend.models.ClienteEntity;
import com.unisatc.backend.models.FornecedorEntity;

public record SinistroDTO(
    Integer id,
    LocalDate data,
    ClienteEntity cliente,
    CelularEntity celular,
    String local,
    Time horario,
    FornecedorEntity fornecedor,
    String descricao
) {
    
}
