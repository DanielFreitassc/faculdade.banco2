package com.unisatc.backend.mappers;

import org.springframework.stereotype.Component;

import com.unisatc.backend.dtos.SinistroDTO;
import com.unisatc.backend.models.SinistroEntity;

@Component
public class SinistroMapper {
    public SinistroDTO toDto(SinistroEntity sinistroEntity) {
        return new SinistroDTO(
        sinistroEntity.getId(),
        sinistroEntity.getData(),
        sinistroEntity.getCliente(),
        sinistroEntity.getCelular(),
        sinistroEntity.getLocal(),
        sinistroEntity.getHorario(),
        sinistroEntity.getFornecedor(),
        sinistroEntity.getDescricao(),
        sinistroEntity.getApolice()
        );
    }

    public SinistroEntity toEntity(SinistroDTO sinistroDTO) {
        return SinistroEntity.builder()
        .data(sinistroDTO.data())
        .cliente(sinistroDTO.cliente())
        .celular(sinistroDTO.celular())
        .local(sinistroDTO.local())
        .horario(sinistroDTO.horario())
        .fornecedor(sinistroDTO.fornecedor())
        .descricao(sinistroDTO.descricao())
        .apolice(sinistroDTO.apolice())
        .build();
    }
}
