package com.unisatc.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.unisatc.backend.dtos.FornecedorDTO;
import com.unisatc.backend.mappers.FornecedorMapper;
import com.unisatc.backend.models.FornecedorEntity;
import com.unisatc.backend.repositories.FornecedorRepository;

@Service
public class FornecedorService {
    @Autowired
    private FornecedorRepository fornecedorRepository;
    @Autowired
    private FornecedorMapper fornecedorMapper;


    public FornecedorDTO createFornecedor(FornecedorDTO fornecedorDTO) {
        FornecedorEntity fornecedorEntity = fornecedorMapper.toEntity(fornecedorDTO);
        FornecedorEntity fornecedor = fornecedorRepository.save(fornecedorEntity);
        return fornecedorMapper.toDto(fornecedor);
    }

    public List<FornecedorDTO> getAllFornecedores() {
        List<FornecedorEntity> fornecedores = fornecedorRepository.findAll();
        return fornecedores.stream().map(fornecedorMapper::toDto).toList();
    }
    
    public FornecedorDTO getFornecedorById(Integer id) {
        Optional<FornecedorEntity> fornecedor = fornecedorRepository.findById(id);
        if(fornecedor.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum fornecedor com este ID cadastrado no momento");
        return fornecedorMapper.toDto(fornecedor.get());
    }

    public FornecedorDTO updateFornecedor(Integer id, FornecedorDTO fornecedorDTO) {
        Optional<FornecedorEntity> fornecedor = fornecedorRepository.findById(id);
        if(fornecedor.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum fornecedor com este ID cadastrado no momento");
        FornecedorEntity fornecedorEntity = fornecedorMapper.toEntity(fornecedorDTO);
        fornecedorEntity.setId(id);
        FornecedorEntity updateFornecedor = fornecedorRepository.save(fornecedorEntity);
        return fornecedorMapper.toDto(updateFornecedor);
    }

    public FornecedorDTO deleteFornecedor(Integer id) {
        Optional<FornecedorEntity> fornecedor = fornecedorRepository.findById(id);
        if(fornecedor.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum fornecedor com este ID cadastrado no momento");
        fornecedorRepository.delete(fornecedor.get());
        return fornecedorMapper.toDto(fornecedor.get());
    }
}
