package com.example.gestao_academia.controller;

import com.example.gestao_academia.model.Mensalidade;
import com.example.gestao_academia.service.MensalidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/mensalidades")
@CrossOrigin(origins = "*")
public class MensalidadeController {
    @Autowired
    private MensalidadeService service;

    @GetMapping public List<Mensalidade> listar() { return service.listarTodos(); }
    @PostMapping public Mensalidade criar(@RequestBody Mensalidade m) { return service.salvar(m); }
    @DeleteMapping("/{id}") public void deletar(@PathVariable Long id) { service.excluir(id); }
}