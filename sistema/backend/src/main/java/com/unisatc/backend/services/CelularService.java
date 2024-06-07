package com.unisatc.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.unisatc.backend.dtos.CelularDTO;
import com.unisatc.backend.mappers.CelularMapper;
import com.unisatc.backend.models.CelularEntity;
import com.unisatc.backend.repositories.CelularRepository;

@Service
public class CelularService {
    @Autowired
    private CelularRepository celularRepository;
    @Autowired
    private CelularMapper celularMapper;


    public CelularDTO createCelular(CelularDTO celularDTO) {
        CelularEntity celularEntity = celularMapper.toEntity(celularDTO);
        CelularEntity celular = celularRepository.save(celularEntity);
        return celularMapper.toDto(celular);
    }

    public List<CelularDTO> getAllCelulares() {
        List<CelularEntity> celulares = celularRepository.findAll();
        return celulares.stream().map(celularMapper::toDto).toList();
    }

    public CelularDTO getCelularByID(Integer id) {
        Optional<CelularEntity> celular = celularRepository.findById(id);
        if(celular.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum celular com este ID cadastrado no momento");
        return celularMapper.toDto(celular.get());
    }

    public CelularDTO updateCelular(Integer id, CelularDTO celularDTO) {
        Optional<CelularEntity> celular = celularRepository.findById(id);
        if(celular.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum celular com este ID cadastrado no momento");
        CelularEntity celularEntity = celularMapper.toEntity(celularDTO);
        celularEntity.setId(id);
        CelularEntity updateCelular = celularRepository.save(celularEntity);
        return celularMapper.toDto(updateCelular);
    }
    
    public CelularDTO deleteCelular(Integer id) {
        Optional<CelularEntity> celular = celularRepository.findById(id);
        if(celular.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum celular com este ID cadastrado no momento");
        celularRepository.delete(celular.get());
        return celularMapper.toDto(celular.get());
    }
}
