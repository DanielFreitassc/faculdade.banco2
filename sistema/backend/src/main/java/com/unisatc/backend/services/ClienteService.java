package com.unisatc.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.unisatc.backend.dtos.ClienteDTO;
import com.unisatc.backend.mappers.ClienteMapper;
import com.unisatc.backend.models.ClienteEntity;
import com.unisatc.backend.repositories.ClienteRepository;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ClienteMapper clienteMapper;

    public ClienteDTO createCliente(ClienteDTO clienteDTO) {
        ClienteEntity clienteEntity = clienteMapper.toEntity(clienteDTO);
        ClienteEntity cliente = clienteRepository.save(clienteEntity);
        return clienteMapper.toDto(cliente);
    }

    public List<ClienteDTO> getAllClientes() {
        List<ClienteEntity> clienteEntities = clienteRepository.findAll();
        return clienteEntities.stream().map(clienteMapper::toDto).toList();
    }

    public ClienteDTO getClienteById(Integer id) {
        Optional<ClienteEntity> cliente = clienteRepository.findById(id);
        if(cliente.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum cliente com este ID cadastrado no momento");
        return clienteMapper.toDto(cliente.get());
    }

    public ClienteDTO updateCliente(Integer id, ClienteDTO clienteDTO) {
        Optional<ClienteEntity> cliente = clienteRepository.findById(id);
        if(cliente.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum cliente com este ID cadastrado no momento");
        ClienteEntity clienteEntity = clienteMapper.toEntity(clienteDTO);
        clienteEntity.setId(id);
        ClienteEntity updateCliente = clienteRepository.save(clienteEntity);
        return clienteMapper.toDto(updateCliente);
    }

    public ClienteDTO deleteCliente(Integer id) {
        Optional<ClienteEntity> cliente = clienteRepository.findById(id);
        if(cliente.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum cliente com este ID cadastrado no momento");
        clienteRepository.delete(cliente.get());
        return clienteMapper.toDto(cliente.get());
    }
}
