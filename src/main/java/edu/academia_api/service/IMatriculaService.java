package edu.academia_api.service;

import edu.academia_api.entity.Matricula;
import edu.academia_api.entity.dto.matricula.MatriculaCreateDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IMatriculaService {
    Matricula create(MatriculaCreateDTO matricula);
    List<Matricula> getAll(String bairro);
    Matricula get(Long id);
    void delete(Long id);
}
