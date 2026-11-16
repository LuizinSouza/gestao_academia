package com.example.gestao_academia.service;

import com.example.gestao_academia.model.Treino;
import com.example.gestao_academia.repository.TreinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TreinoService {
    @Autowired
    private TreinoRepository repository;

    public List<Treino> listarTodos() { return repository.findAll(); }
    public Treino salvar(Treino t) { return repository.save(t); }
    public void excluir(Long id) { repository.deleteById(id); }
}