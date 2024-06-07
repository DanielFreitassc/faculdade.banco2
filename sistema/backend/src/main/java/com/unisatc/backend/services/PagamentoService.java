package com.unisatc.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.unisatc.backend.dtos.PagamentoDTO;
import com.unisatc.backend.mappers.PagamentoMapper;
import com.unisatc.backend.models.PagamentoEntity;
import com.unisatc.backend.repositories.PagamentoRepository;

@Service
public class PagamentoService {
    @Autowired
    private PagamentoRepository pagamentoRepository;
    @Autowired
    private PagamentoMapper pagamentoMapper;

    public PagamentoDTO createPagamento(PagamentoDTO pagamentoDTO) {
        PagamentoEntity pagamentoEntity = pagamentoMapper.toEntity(pagamentoDTO);
        PagamentoEntity pagamento = pagamentoRepository.save(pagamentoEntity);
        return pagamentoMapper.toDto(pagamento);
    }
    
    public List<PagamentoDTO> getAllPagamentos() {
        List<PagamentoEntity> pagamentos = pagamentoRepository.findAll();
        if(pagamentos.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum pagamento cadastrado no momento");
        return pagamentos.stream().map(pagamentoMapper::toDto).toList();
    }

    public PagamentoDTO getPagamentoById(Integer id) {
        Optional<PagamentoEntity> pagamento = pagamentoRepository.findById(id);
        if(pagamento.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum pagamento com este ID cadastado no momento");
        return pagamentoMapper.toDto(pagamento.get());
    }

    public PagamentoDTO updatePagamento(Integer id, PagamentoDTO pagamentoDTO) {
        Optional<PagamentoEntity> pagamento = pagamentoRepository.findById(id);
        if(pagamento.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum pagamento com este ID cadastado no momento");
        PagamentoEntity pagamentoEntity = pagamentoMapper.toEntity(pagamentoDTO);
        pagamentoEntity.setId(id);
        PagamentoEntity updatePagamento = pagamentoRepository.save(pagamentoEntity);
        return pagamentoMapper.toDto(updatePagamento);
    }

    public PagamentoDTO deletePagameto(Integer id) {
        Optional<PagamentoEntity> pagamento = pagamentoRepository.findById(id);
        if(pagamento.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum pagamento com este ID cadastado no momento");
        pagamentoRepository.delete(pagamento.get());
        return pagamentoMapper.toDto(pagamento.get());
    }

}
