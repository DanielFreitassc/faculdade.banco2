package com.unisatc.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.unisatc.backend.dtos.ClienteDTO;
import com.unisatc.backend.services.ClienteService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteDTO createCliente(@RequestBody @Valid ClienteDTO clienteDTO) {
        return clienteService.createCliente(clienteDTO);
    }

    @GetMapping
    public List<ClienteDTO> getAllCliente() {
        return clienteService.getAllClientes();
    }

    @GetMapping("{id}")
    public ClienteDTO getClienteById(@PathVariable Integer id) {
        return clienteService.getClienteById(id);
    }

    @PutMapping("{id}")
    public ClienteDTO updateCliente(@PathVariable Integer id,@RequestBody @Valid ClienteDTO clienteDTO) {
        return clienteService.updateCliente(id, clienteDTO);
    }

    @DeleteMapping("{id}")
    public ClienteDTO deleteCliente(@PathVariable Integer id) {
        return clienteService.deleteCliente(id);
    }
}
