package com.example.gestao_academia.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "professores")
@Data
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;
    private String especialidade;
    private String telefone;

    @JsonIgnore
    @OneToMany(mappedBy = "professor", cascade = CascadeType.ALL)
    private List<Treino> treinos;
}