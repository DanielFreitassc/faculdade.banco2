package com.unisatc.backend.models;

import java.sql.Time;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "sinistro")
public class SinistroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDate data;
    @ManyToOne
    @JoinColumn(name = "cliente")
    private ClienteEntity cliente;
    @ManyToOne
    @JoinColumn(name = "celular")
    private CelularEntity celular;
    private String local;
    private Time horario;
    @ManyToOne
    @JoinColumn(name = "fornecedor")
    private FornecedorEntity fornecedor;
    private String descricao;    
}
