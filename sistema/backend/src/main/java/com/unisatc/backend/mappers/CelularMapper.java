package com.unisatc.backend.mappers;

import org.springframework.stereotype.Component;

import com.unisatc.backend.dtos.CelularDTO;
import com.unisatc.backend.models.CelularEntity;

@Component
public class CelularMapper {
    public CelularDTO toDto(CelularEntity celularEntity) {
        return new CelularDTO(
        celularEntity.getId(),
        celularEntity.getModelo(),
        celularEntity.getAno(),
        celularEntity.getMarca(),
        celularEntity.getCliente()
        );
    }

    public CelularEntity toEntity(CelularDTO celularDTO) {
        return CelularEntity.builder()
        .modelo(celularDTO.modelo())
        .ano(celularDTO.ano())
        .marca(celularDTO.marca())
        .cliente(celularDTO.cliente())
        .build();
    }
}
