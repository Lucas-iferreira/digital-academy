package edu.academia_api.service;

import edu.academia_api.entity.Aluno;
import edu.academia_api.entity.AvaliacaoFisica;
import edu.academia_api.entity.dto.aluno.AlunoCreateDTO;
import edu.academia_api.entity.dto.aluno.AlunoUpdateDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IAlunoService {
    List<Aluno> getAll(String dataDeNascimento);
    Aluno getOne(Long id);
    Aluno create(AlunoCreateDTO aluno);
    Aluno update(Long id, AlunoUpdateDTO aluno);
    void delete(Long id);
    List<AvaliacaoFisica> getAllAvaliacaoFisica(Long id);

}
