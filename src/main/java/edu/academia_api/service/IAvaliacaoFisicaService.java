package edu.academia_api.service;

import edu.academia_api.entity.Aluno;
import edu.academia_api.entity.AvaliacaoFisica;
import edu.academia_api.entity.dto.avaliacao.AvaliacaoFisicaCreateDTO;
import edu.academia_api.entity.dto.avaliacao.AvaliacaoFisicaUpdateDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IAvaliacaoFisicaService {
    AvaliacaoFisica create(AvaliacaoFisicaCreateDTO dto);
    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateDTO updateDTO);
    void delete(Long id);

}
