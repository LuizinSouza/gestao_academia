package com.example.gestao_academia.controller;

import com.example.gestao_academia.model.Plano;
import com.example.gestao_academia.service.PlanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/planos")
@CrossOrigin(origins = "*")
public class PlanoController {

    @Autowired
    private PlanoService service;

    @GetMapping
    public List<Plano> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Plano criar(@RequestBody Plano plano) {
        return service.salvar(plano);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.excluir(id);
    }
}
