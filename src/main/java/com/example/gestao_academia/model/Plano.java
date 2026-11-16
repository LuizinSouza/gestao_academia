package com.example.gestao_academia.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

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

    @JsonIgnore
    @OneToMany(mappedBy = "plano")
    private List<Aluno> alunos;
}