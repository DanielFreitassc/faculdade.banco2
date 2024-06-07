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

import com.unisatc.backend.dtos.SinistroDTO;
import com.unisatc.backend.services.SinistroService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("sinistro")
public class SinistroController {
    @Autowired
    private SinistroService sinistroService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public SinistroDTO createSinistro(@RequestBody @Valid SinistroDTO sinistroDTO) {
        return sinistroService.createSinistro(sinistroDTO);
    }

    @GetMapping
    public List<SinistroDTO> getAllSinistros() {
        return sinistroService.getAllSinistros();
    }

    @GetMapping("{id}")
    public SinistroDTO getSinistroById(@PathVariable Integer id) {
        return sinistroService.getSinistroById(id);
    }

    @PutMapping("{id}")
    public SinistroDTO updateSinistro(@PathVariable Integer id, @RequestBody @Valid SinistroDTO sinistroDTO) {
        return sinistroService.updateSinistro(id, sinistroDTO);
    }

    @DeleteMapping("{id}")
    public SinistroDTO deleteSinistro(@PathVariable Integer id) {
        return sinistroService.deleteSinistro(id);
    }

}
