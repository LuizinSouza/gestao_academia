package com.example.gestao_academia.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "mensalidades")
@Data
public class Mensalidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    private Double valor;
    private LocalDate dataVencimento;
    private LocalDate dataPagamento;
    private String status; // Pendente, Pago, Atrasado
}