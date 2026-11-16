package com.example.gestao_academia.controller;

import com.example.gestao_academia.model.Treino;
import com.example.gestao_academia.service.TreinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/treinos")
@CrossOrigin(origins = "*")
public class TreinoController {
    @Autowired
    private TreinoService service;

    @GetMapping public List<Treino> listar() { return service.listarTodos(); }
    @PostMapping public Treino criar(@RequestBody Treino t) { return service.salvar(t); }
    @DeleteMapping("/{id}") public void deletar(@PathVariable Long id) { service.excluir(id); }
}