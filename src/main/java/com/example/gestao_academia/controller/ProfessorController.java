package com.example.gestao_academia.controller;

import com.example.gestao_academia.model.Professor;
import com.example.gestao_academia.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/professores")
@CrossOrigin(origins = "*")
public class ProfessorController {
    @Autowired
    private ProfessorService service;

    @GetMapping public List<Professor> listar() { return service.listarTodos(); }
    @PostMapping public Professor criar(@RequestBody Professor p) { return service.salvar(p); }
    @DeleteMapping("/{id}") public void deletar(@PathVariable Long id) { service.excluir(id); }
}