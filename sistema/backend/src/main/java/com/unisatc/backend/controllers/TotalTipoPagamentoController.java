package com.unisatc.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unisatc.backend.dtos.TotalTipoPagamentoDTO;
import com.unisatc.backend.services.TotalTipoPagamentoService;

@RestController
@RequestMapping("/total-pagamentos")
public class TotalTipoPagamentoController {
    @Autowired
    private TotalTipoPagamentoService totalTipoPagamentoService;

    @GetMapping
    public List<TotalTipoPagamentoDTO> getLogs() {
        return totalTipoPagamentoService.getLogs();
    }
    
}
