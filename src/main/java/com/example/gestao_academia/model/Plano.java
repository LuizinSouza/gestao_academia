package com.example.gestao_academia.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "planos")
@Data
public class Plano {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Double valor;
    private Integer duracaoMeses;
}