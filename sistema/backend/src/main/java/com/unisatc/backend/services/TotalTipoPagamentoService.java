package com.unisatc.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unisatc.backend.dtos.TotalTipoPagamentoDTO;
import com.unisatc.backend.mappers.TotalTipoPagamentoMapper;
import com.unisatc.backend.models.TotalTipoPagamentoEntity;
import com.unisatc.backend.repositories.TotalTipoPagamentoRepository;

@Service
public class TotalTipoPagamentoService {
    @Autowired
    private TotalTipoPagamentoRepository totalTipoPagamentoRepository;
    @Autowired
    private TotalTipoPagamentoMapper totalTipoPagamentoMapper;


    public List<TotalTipoPagamentoDTO> getLogs() {
        List<TotalTipoPagamentoEntity> logs = totalTipoPagamentoRepository.findAll();
        return logs.stream().map(totalTipoPagamentoMapper::toDto).toList();
    }
    
    
}
