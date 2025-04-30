package edu.academia_api.service.impl;

import edu.academia_api.entity.Aluno;
import edu.academia_api.entity.Matricula;
import edu.academia_api.entity.dto.matricula.MatriculaCreateDTO;
import edu.academia_api.repository.AlunoRepository;
import edu.academia_api.repository.MatriculaRepository;
import edu.academia_api.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaServiceImpl implements IMatriculaService {
    @Autowired
    private MatriculaRepository matriculaRepository;
    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Matricula create(MatriculaCreateDTO matriculaDTO) {
        Matricula matricula = new Matricula();

        Aluno aluno = alunoRepository
                .findById(matriculaDTO.getAlunoId())
                .get();

        matricula.setAluno(aluno);

        return matriculaRepository.save(matricula);

    }

    @Override
    public List<Matricula> getAll(String bairro) {
        if (bairro == null) {
            return matriculaRepository.findAll();
        } else {
            return matriculaRepository.findByAlunoBairro(bairro);
        }
    }

    @Override
    public Matricula get(Long id) {
        return matriculaRepository.findById(id).get();
    }

    @Override
    public void delete(Long id) {
        matriculaRepository.deleteById(id);
    }
}
