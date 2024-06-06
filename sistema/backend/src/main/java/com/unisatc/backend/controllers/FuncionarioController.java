package com.unisatc.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unisatc.backend.dtos.FuncionarioDTO;
import com.unisatc.backend.services.FuncionarioService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("funcionario")
public class FuncionarioController {
    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping
    public FuncionarioDTO createFuncionario(@RequestBody @Valid FuncionarioDTO funcionarioDTO) {
        return funcionarioService.createFuncionario(funcionarioDTO);
    }

    @GetMapping
    public List<FuncionarioDTO> getAllFuncionarios() {
        return funcionarioService.getAllFuncionarios();
    }

    @GetMapping("{id}")
    public FuncionarioDTO getFuncionarioById(@PathVariable Integer id) {
        return funcionarioService.getFuncionarioById(id);
    }

    @PutMapping("{id}")
    public FuncionarioDTO updateFuncionario(@PathVariable Integer id, @RequestBody @Valid FuncionarioDTO funcionarioDTO) {
        return funcionarioService.upadateFuncionario(id, funcionarioDTO);
    }

    @DeleteMapping("{id}")
    public FuncionarioDTO deleteFuncionario(@PathVariable Integer id) {
        return funcionarioService.deleteFuncionario(id);
    }
}
