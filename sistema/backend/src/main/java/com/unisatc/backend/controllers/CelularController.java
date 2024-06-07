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

import com.unisatc.backend.dtos.CelularDTO;
import com.unisatc.backend.services.CelularService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("celular")
public class CelularController {
    @Autowired
    private CelularService celularService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CelularDTO createCelular(@RequestBody @Valid CelularDTO celularDTO) {
        return celularService.createCelular(celularDTO);
    }

    @GetMapping
    public List<CelularDTO> getAllCelulares() {
        return celularService.getAllCelulares();
    }

    @GetMapping("{id}")
    public CelularDTO getCelularById(@PathVariable Integer id) {
        return celularService.getCelularByID(id);
    }

    @PutMapping("{id}")
    public CelularDTO updateCelular(@PathVariable Integer id, @RequestBody @Valid CelularDTO celularDTO) {
        return celularService.updateCelular(id, celularDTO);
    }

    @DeleteMapping("{id}")
    public CelularDTO deleteCelular(@PathVariable Integer id) {
        return celularService.deleteCelular(id);
    }
}
