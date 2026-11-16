package com.example.gestao_academia.service;

import com.example.gestao_academia.model.Professor;
import com.example.gestao_academia.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProfessorService {
    @Autowired
    private ProfessorRepository repository;

    public List<Professor> listarTodos() { return repository.findAll(); }
    public Professor salvar(Professor p) { return repository.save(p); }
    public void excluir(Long id) { repository.deleteById(id); }
}