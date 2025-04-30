package edu.academia_api.controller;

import edu.academia_api.entity.AvaliacaoFisica;
import edu.academia_api.entity.dto.avaliacao.AvaliacaoFisicaCreateDTO;
import edu.academia_api.entity.dto.avaliacao.AvaliacaoFisicaUpdateDTO;
import edu.academia_api.service.impl.AvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {
    @Autowired
    private AvaliacaoFisicaServiceImpl avaliacaoFisicaService;

    @PostMapping()
    public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaCreateDTO createDTO){
        return avaliacaoFisicaService.create(createDTO);
    }

    @PutMapping("/{id}")
    public AvaliacaoFisica update(@PathVariable("id") Long id, @RequestBody AvaliacaoFisicaUpdateDTO updateDTO){
        return avaliacaoFisicaService.update(id, updateDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        avaliacaoFisicaService.delete(id);
    }

}
