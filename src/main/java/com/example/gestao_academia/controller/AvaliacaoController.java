package com.example.gestao_academia.controller;

import com.example.gestao_academia.model.AvaliacaoFisica;
import com.example.gestao_academia.service.AvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/avaliacoes")
@CrossOrigin(origins = "*")
public class AvaliacaoController {
    @Autowired
    private AvaliacaoFisicaService service;

    @GetMapping public List<AvaliacaoFisica> listar() { return service.listarTodos(); }
    @PostMapping public AvaliacaoFisica criar(@RequestBody AvaliacaoFisica a) { return service.salvar(a); }
    @DeleteMapping("/{id}") public void deletar(@PathVariable Long id) { service.excluir(id); }
}