package com.example.gestao_academia.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "treinos")
@Data
public class Treino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;

    private String exercicios; // Descrição dos exercícios da ficha
    private String objetivo;   // Hipertrofia, Emagrecimento, etc.
}