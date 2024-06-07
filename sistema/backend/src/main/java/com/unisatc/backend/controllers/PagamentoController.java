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

import com.unisatc.backend.dtos.PagamentoDTO;
import com.unisatc.backend.services.PagamentoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("pagamento")
public class PagamentoController {
    @Autowired
    private PagamentoService pagamentoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PagamentoDTO createPagamento(@RequestBody @Valid PagamentoDTO pagamentoDTO) {
        return pagamentoService.createPagamento(pagamentoDTO);
    }

    @GetMapping
    public List<PagamentoDTO> getAllPagamentos() {
        return pagamentoService.getAllPagamentos();
    }

    @GetMapping("{id}")
    public PagamentoDTO getPagamentoById(@PathVariable Integer id) {
        return pagamentoService.getPagamentoById(id);
    }

    @PutMapping("{id}")
    public PagamentoDTO updatePagamento(@PathVariable Integer id, @RequestBody @Valid PagamentoDTO pagamentoDTO) {
        return pagamentoService.updatePagamento(id, pagamentoDTO);
    }

    @DeleteMapping("{id}")
    public PagamentoDTO deletePagamento(@PathVariable Integer id) {
        return pagamentoService.deletePagameto(id);
    }
}
