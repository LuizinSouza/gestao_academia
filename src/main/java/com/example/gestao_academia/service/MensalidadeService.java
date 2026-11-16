package com.example.gestao_academia.service;

import com.example.gestao_academia.model.Mensalidade;
import com.example.gestao_academia.repository.MensalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MensalidadeService {
    @Autowired
    private MensalidadeRepository repository;

    public List<Mensalidade> listarTodos() { return repository.findAll(); }
    public Mensalidade salvar(Mensalidade m) { return repository.save(m); }
    public void excluir(Long id) { repository.deleteById(id); }
}