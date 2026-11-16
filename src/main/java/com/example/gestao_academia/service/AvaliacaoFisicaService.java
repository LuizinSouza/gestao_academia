package com.example.gestao_academia.service;

import com.example.gestao_academia.model.AvaliacaoFisica;
import com.example.gestao_academia.repository.AvaliacaoFisicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AvaliacaoFisicaService {
    @Autowired
    private AvaliacaoFisicaRepository repository;

    public List<AvaliacaoFisica> listarTodos() { return repository.findAll(); }
    public AvaliacaoFisica salvar(AvaliacaoFisica a) { return repository.save(a); }
    public void excluir(Long id) { repository.deleteById(id); }
}