package com.example.gestao_academia.service;

import com.example.gestao_academia.model.Plano;
import com.example.gestao_academia.repository.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PlanoService {

    @Autowired
    private PlanoRepository repository;

    public List<Plano> listarTodos() {
        return repository.findAll();
    }

    public Plano salvar(Plano plano) {
        return repository.save(plano);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}
