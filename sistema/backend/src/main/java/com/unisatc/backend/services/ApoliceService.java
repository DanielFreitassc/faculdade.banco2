package com.unisatc.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.unisatc.backend.dtos.ApoliceDTO;
import com.unisatc.backend.mappers.ApoliceMapper;
import com.unisatc.backend.models.ApoliceEntity;
import com.unisatc.backend.repositories.ApoliceRepository;

@Service
public class ApoliceService {
    @Autowired
    private ApoliceRepository apoliceRepository;
    @Autowired
    private ApoliceMapper apoliceMapper;

    public ApoliceDTO createApolice(ApoliceDTO apoliceDTO) {
        ApoliceEntity apoliceEntity = apoliceMapper.toEntity(apoliceDTO);
        ApoliceEntity apolice = apoliceRepository.save(apoliceEntity);
        return apoliceMapper.toDto(apolice);
    }

    public List<ApoliceDTO> getAllApolices() {
        List<ApoliceEntity> apolices = apoliceRepository.findAll();
        return apolices.stream().map(apoliceMapper::toDto).toList();
    }

    public ApoliceDTO getApoliceById(Integer id) {
        Optional<ApoliceEntity> apolice = apoliceRepository.findById(id);
        if(apolice.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhuma apolice com es ID cadastrado no momento");
        return apoliceMapper.toDto(apolice.get());
    }

    public ApoliceDTO updateApolice(Integer id, ApoliceDTO apoliceDTO) {
        Optional<ApoliceEntity> apolice = apoliceRepository.findById(id);
        if(apolice.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhuma apolice com es ID cadastrado no momento");
        ApoliceEntity apoliceEntity = apoliceMapper.toEntity(apoliceDTO);
        apoliceEntity.setId(id);
        ApoliceEntity updateApolice = apoliceRepository.save(apoliceEntity);
        return apoliceMapper.toDto(updateApolice);
    }

    public ApoliceDTO deleteApolice(Integer id) {
        Optional<ApoliceEntity> apolice = apoliceRepository.findById(id);
        if(apolice.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhuma apolice com es ID cadastrado no momento");
        apoliceRepository.delete(apolice.get());
        return apoliceMapper.toDto(apolice.get());
    }
}
