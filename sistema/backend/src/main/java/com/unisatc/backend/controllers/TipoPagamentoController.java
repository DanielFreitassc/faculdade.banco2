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

import com.unisatc.backend.dtos.TipoPagamentoDTO;
import com.unisatc.backend.services.TipoPagamentoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("tipo-pagamento")
public class TipoPagamentoController {
    @Autowired
    private TipoPagamentoService tipoPagamentoService;

    @PostMapping
    public TipoPagamentoDTO createTipoPagamento(@RequestBody @Valid TipoPagamentoDTO tipoPagamentoDTO) {
        return tipoPagamentoService.createTipoPagamento(tipoPagamentoDTO);
    }

    @GetMapping
    public List<TipoPagamentoDTO> getAllTipoPagamentos() {
        return tipoPagamentoService.getAllTipoPagamentos();
    }

    @GetMapping("{id}")
    public TipoPagamentoDTO getTipoPagamentoById(@PathVariable Integer id) {
        return tipoPagamentoService.getTipoPagementoById(id);
    }

    @PutMapping("{id}")
    public TipoPagamentoDTO updateTipoPagamento(@PathVariable Integer id, @RequestBody @Valid TipoPagamentoDTO tipoPagamentoDTO) {
        return tipoPagamentoService.updateTipoPagamento(id, tipoPagamentoDTO);
    }

    @DeleteMapping("{id}")
    public TipoPagamentoDTO deleteTipoPagamento(@PathVariable Integer id) {
        return tipoPagamentoService.deleteTipoPagamento(id);
    }

}
