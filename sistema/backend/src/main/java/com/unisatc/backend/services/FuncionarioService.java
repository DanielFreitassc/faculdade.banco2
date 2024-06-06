package com.unisatc.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.unisatc.backend.dtos.FuncionarioDTO;
import com.unisatc.backend.mappers.FuncionarioMapper;
import com.unisatc.backend.models.FuncionarioEntity;
import com.unisatc.backend.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository funcionarioRepository;
    @Autowired
    private FuncionarioMapper funcionarioMapper;

    public FuncionarioDTO createFuncionario(FuncionarioDTO funcionarioDTO) {
        FuncionarioEntity funcionarioEntity = funcionarioMapper.toEntity(funcionarioDTO);
        FuncionarioEntity funcionario = funcionarioRepository.save(funcionarioEntity);
        return funcionarioMapper.toDto(funcionario);
    }

    public List<FuncionarioDTO> getAllFuncionarios() {
        List<FuncionarioEntity> funcionarios = funcionarioRepository.findAll();
        if(funcionarios.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum funcionario cadastrado no momento");
        return funcionarios.stream().map(funcionarioMapper::toDto).toList();
    }

    public FuncionarioDTO getFuncionarioById(Integer id) {
        Optional<FuncionarioEntity> funcionario = funcionarioRepository.findById(id);
        if(funcionario.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum funcionario com este ID cadastrado no momento");
        return funcionarioMapper.toDto(funcionario.get());
    }

    public FuncionarioDTO upadateFuncionario(Integer id, FuncionarioDTO funcionarioDTO) {
        Optional<FuncionarioEntity> funcionario = funcionarioRepository.findById(id);
        if(funcionario.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum funcionario com este ID cadastrado no momento");
        FuncionarioEntity funcionarioEntity = funcionarioMapper.toEntity(funcionarioDTO);
        funcionarioEntity.setId(id);
        FuncionarioEntity upadateFuncionario = funcionarioRepository.save(funcionarioEntity);
        return funcionarioMapper.toDto(upadateFuncionario);
    }

    public FuncionarioDTO deleteFuncionario(Integer id) {
        Optional<FuncionarioEntity> funcionario = funcionarioRepository.findById(id);
        if(funcionario.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum funcionario com este ID cadastrado no momento");
        funcionarioRepository.delete(funcionario.get());
        return funcionarioMapper.toDto(funcionario.get());
    }

}
