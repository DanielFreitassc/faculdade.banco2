package com.unisatc.backend.dtos;

import com.unisatc.backend.models.ClienteEntity;

public record CelularDTO(
    Integer id,
    String modelo,
    int ano,
    String marca,
    ClienteEntity cliente
) {
    
}
