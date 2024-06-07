package com.unisatc.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.unisatc.backend.dtos.TipoPagamentoDTO;
import com.unisatc.backend.mappers.TipoPagamentoMapper;
import com.unisatc.backend.models.TipoPagamentoEntity;
import com.unisatc.backend.repositories.TipoPagamentoRepository;

@Service
public class TipoPagamentoService {
    @Autowired
    private TipoPagamentoRepository tipoPagamentoRepository;
    @Autowired
    private TipoPagamentoMapper tipoPagamentoMapper;

    public TipoPagamentoDTO createTipoPagamento(TipoPagamentoDTO tipoPagamentoDTO) {
        TipoPagamentoEntity tipoPagamentoEntity = tipoPagamentoMapper.toEntity(tipoPagamentoDTO);
        TipoPagamentoEntity tipoPagamento = tipoPagamentoRepository.save(tipoPagamentoEntity);
        return tipoPagamentoMapper.toDto(tipoPagamento);
    }

    public List<TipoPagamentoDTO> getAllTipoPagamentos() {
        List<TipoPagamentoEntity> tipos = tipoPagamentoRepository.findAll();
        if(tipos.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum tipo de pagamento cadastrado no momento");
        return tipos.stream().map(tipoPagamentoMapper::toDto).toList();
    }

    public TipoPagamentoDTO getTipoPagementoById(Integer id) {
        Optional<TipoPagamentoEntity> tipo = tipoPagamentoRepository.findById(id);
        if(tipo.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum tipo de pagamento com este ID cadastrado no momento");
        return tipoPagamentoMapper.toDto(tipo.get());
    }

    public TipoPagamentoDTO updateTipoPagamento(Integer id, TipoPagamentoDTO tipoPagamentoDTO) {
        Optional<TipoPagamentoEntity> tipo = tipoPagamentoRepository.findById(id);
        if(tipo.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum tipo de pagamento com este ID cadastrado no momento");
        TipoPagamentoEntity tipoPagamentoEntity = tipoPagamentoMapper.toEntity(tipoPagamentoDTO);
        tipoPagamentoEntity.setId(id);
        TipoPagamentoEntity updateTipo = tipoPagamentoRepository.save(tipoPagamentoEntity);
        return tipoPagamentoMapper.toDto(updateTipo);
    }

    public TipoPagamentoDTO deleteTipoPagamento(Integer id) {
        Optional<TipoPagamentoEntity> tipo = tipoPagamentoRepository.findById(id);
        if(tipo.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum tipo de pagamento com este ID cadastrado no momento");
        tipoPagamentoRepository.delete(tipo.get());
        return tipoPagamentoMapper.toDto(tipo.get());
    }
}
