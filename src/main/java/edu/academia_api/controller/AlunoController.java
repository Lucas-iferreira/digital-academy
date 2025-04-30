package edu.academia_api.controller;


import edu.academia_api.entity.Aluno;
import edu.academia_api.entity.AvaliacaoFisica;
import edu.academia_api.entity.dto.aluno.AlunoCreateDTO;
import edu.academia_api.entity.dto.aluno.AlunoUpdateDTO;
import edu.academia_api.service.impl.AlunoServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoServiceImpl service;

    @GetMapping()
    public List<Aluno> getAll(@RequestParam(value = "dataDeNascimento", required = false)String dataDeNascimento) {
        return service.getAll(dataDeNascimento);
    }

    @GetMapping("/{id}")
    public Aluno getById(@PathVariable("id") Long id) {
        return service.getOne(id);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getListaAvaliacaoFisica(@PathVariable("id") Long id) {
        return service.getAllAvaliacaoFisica(id);
    }



    @PostMapping()
    public Aluno create(@Valid @RequestBody AlunoCreateDTO aluno) {
        return service.create(aluno);
    }

    @PutMapping("/{id}")
    public Aluno update(@PathVariable Long id, @RequestBody AlunoUpdateDTO aluno) {
        return service.update(id, aluno);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        service.delete(id);
    }



}
