package com.unisatc.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.unisatc.backend.dtos.SinistroDTO;
import com.unisatc.backend.mappers.SinistroMapper;
import com.unisatc.backend.models.SinistroEntity;
import com.unisatc.backend.repositories.SinistroRepository;

@Service
public class SinistroService {
    @Autowired
    private SinistroRepository sinistroRepository;
    @Autowired
    private SinistroMapper sinistroMapper;

    public SinistroDTO createSinistro(SinistroDTO sinistroDTO) {
        SinistroEntity sinistroEntity = sinistroMapper.toEntity(sinistroDTO);
        SinistroEntity sinistro = sinistroRepository.save(sinistroEntity);
        return sinistroMapper.toDto(sinistro);
    }

    public List<SinistroDTO> getAllSinistros() {
        List<SinistroEntity> sinistros = sinistroRepository.findAll();
        if(sinistros.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum sinistro cadastrado no momento");
        return sinistros.stream().map(sinistroMapper::toDto).toList();
    }

    public SinistroDTO getSinistroById(Integer id) {
        Optional<SinistroEntity> sinistro = sinistroRepository.findById(id);
        if(sinistro.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum sinistro com este ID cadastrado no momento");
        return sinistroMapper.toDto(sinistro.get());
    }

    public SinistroDTO updateSinistro(Integer id, SinistroDTO sinistroDTO) {
        Optional<SinistroEntity> sinistro = sinistroRepository.findById(id);
        if(sinistro.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum sinistro com este ID cadastrado no momento");
        SinistroEntity sinistroEntity = sinistroMapper.toEntity(sinistroDTO);
        sinistroEntity.setId(id);
        SinistroEntity updateSinistro = sinistroRepository.save(sinistroEntity);
        return sinistroMapper.toDto(updateSinistro);
    }

    public SinistroDTO deleteSinistro(Integer id) {
        Optional<SinistroEntity> sinistro = sinistroRepository.findById(id);
        if(sinistro.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum sinistro com este ID cadastrado no momento");
        sinistroRepository.delete(sinistro.get());
        return sinistroMapper.toDto(sinistro.get());
    }

}
