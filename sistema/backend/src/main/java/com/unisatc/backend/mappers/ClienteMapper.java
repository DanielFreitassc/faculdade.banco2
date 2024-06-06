package com.unisatc.backend.mappers;

import org.springframework.stereotype.Component;

import com.unisatc.backend.dtos.ClienteDTO;
import com.unisatc.backend.models.ClienteEntity;

@Component
public class ClienteMapper {
    public ClienteDTO toDto(ClienteEntity clienteEntity) {
        return new ClienteDTO(
        clienteEntity.getId(),
        clienteEntity.getNome(),
        clienteEntity.getSobrenome(),
        clienteEntity.getCpf(),
        clienteEntity.getContato()
        );
    }

    public ClienteEntity toEntity(ClienteDTO clienteDTO) {
        return ClienteEntity.builder()
        .nome(clienteDTO.nome())
        .sobrenome(clienteDTO.sobrenome())
        .cpf(clienteDTO.cpf())
        .contato(clienteDTO.contato())
        .build();
    }
}
