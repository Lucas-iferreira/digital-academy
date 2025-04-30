package edu.academia_api.controller;

import edu.academia_api.entity.Matricula;
import edu.academia_api.entity.dto.matricula.MatriculaCreateDTO;
import edu.academia_api.service.impl.MatriculaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {
    @Autowired
    private MatriculaServiceImpl matriculaService;

    @GetMapping()
    public List<Matricula> getAll(@RequestParam(value = "bairro", required = false) String bairro){
        return matriculaService.getAll(bairro);
    }
    @GetMapping("/{id}")
    public Matricula getOne(@PathVariable("id")Long id){
        return matriculaService.get(id);
    }

    @PostMapping()
    public Matricula create(@RequestBody MatriculaCreateDTO matriculaCreateDTO){
        return matriculaService.create(matriculaCreateDTO);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id){
        matriculaService.delete(id);
    }
}
