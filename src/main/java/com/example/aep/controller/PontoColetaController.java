package com.example.aep.controller;

import com.example.aep.model.PontoColeta;
import com.example.aep.repository.PontoColetaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pontos")
public class PontoColetaController {

    private final PontoColetaRepository repository;

    public PontoColetaController(PontoColetaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<PontoColeta> listar() {
        return repository.findAll();
    }

    @PostMapping
    public PontoColeta criar(@RequestBody PontoColeta ponto) {
        return repository.save(ponto);
    }

}
