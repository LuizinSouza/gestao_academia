package com.example.gestao_academia.service;

import com.example.gestao_academia.model.Aluno;
import com.example.gestao_academia.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    public List<Aluno> listarTodos() {
        return repository.findAll();
    }

    public Aluno salvar(Aluno aluno) {
        return repository.save(aluno);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}