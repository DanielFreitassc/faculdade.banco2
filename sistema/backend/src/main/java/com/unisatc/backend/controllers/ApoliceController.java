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

import com.unisatc.backend.dtos.ApoliceDTO;
import com.unisatc.backend.services.ApoliceService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("apolice")
public class ApoliceController {
    @Autowired
    private ApoliceService apoliceService;

    @PostMapping
    public ApoliceDTO createApolice(@RequestBody @Valid ApoliceDTO apoliceDTO) {
        return apoliceService.createApolice(apoliceDTO);
    }

    @GetMapping
    public List<ApoliceDTO> getAllApolices() {
        return apoliceService.getAllApolices();
    }

    @GetMapping("{id}")
    public ApoliceDTO getApoliceById(@PathVariable Integer id) {
        return apoliceService.getApoliceById(id);
    }

    @PutMapping("{id}")
    public ApoliceDTO updateApolice(@PathVariable Integer id,@RequestBody @Valid ApoliceDTO apoliceDTO) {
        return apoliceService.updateApolice(id, apoliceDTO);
    }

    @DeleteMapping("{id}")
    public ApoliceDTO deleteApolice(@PathVariable Integer id) {
        return apoliceService.deleteApolice(id);
    }
}
