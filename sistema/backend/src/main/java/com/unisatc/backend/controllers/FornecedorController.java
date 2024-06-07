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

import com.unisatc.backend.dtos.FornecedorDTO;
import com.unisatc.backend.services.FornecedorService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("fornecedor")
public class FornecedorController {
    @Autowired
    private FornecedorService fornecedorService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public FornecedorDTO createFornecedor(@RequestBody @Valid FornecedorDTO fornecedorDTO) {
        return fornecedorService.createFornecedor(fornecedorDTO);
    }

    @GetMapping
    public List<FornecedorDTO> getAllFornecedores() {
        return fornecedorService.getAllFornecedores();
    }

    @GetMapping("{id}")
    public FornecedorDTO getFornecedorByid(@PathVariable Integer id) {
        return fornecedorService.getFornecedorById(id);
    }

    @PutMapping("{id}")
    public FornecedorDTO updateFornecedor(@PathVariable Integer id, @RequestBody @Valid FornecedorDTO fornecedorDTO) {
        return fornecedorService.updateFornecedor(id, fornecedorDTO);
    }
    
    @DeleteMapping("{id}")
    public FornecedorDTO deleteFornecedor(@PathVariable Integer id) {
        return fornecedorService.deleteFornecedor(id);
    }
}
