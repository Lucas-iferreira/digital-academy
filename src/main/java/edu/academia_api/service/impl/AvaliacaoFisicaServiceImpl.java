package edu.academia_api.service.impl;

import edu.academia_api.entity.Aluno;
import edu.academia_api.entity.AvaliacaoFisica;
import edu.academia_api.entity.dto.avaliacao.AvaliacaoFisicaCreateDTO;
import edu.academia_api.entity.dto.avaliacao.AvaliacaoFisicaUpdateDTO;
import edu.academia_api.repository.AlunoRepository;
import edu.academia_api.repository.AvaliacaoFisicaRepository;
import edu.academia_api.service.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {
    @Autowired
    private AvaliacaoFisicaRepository avaliacaoFisicaRepository;
    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaCreateDTO dto) {
        AvaliacaoFisica avaliacaoFisicaNova = new AvaliacaoFisica();
        Aluno aluno = alunoRepository.findById(dto.getAlunoId()).get();
        avaliacaoFisicaNova.setAluno(aluno);
        avaliacaoFisicaNova.setPeso(dto.getPeso());
        avaliacaoFisicaNova.setAltura(dto.getAltura());

        return avaliacaoFisicaRepository.save(avaliacaoFisicaNova);
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateDTO updateDTO) {
        Optional<AvaliacaoFisica> avaliacaoFisica = avaliacaoFisicaRepository.findById(id);
        AvaliacaoFisica avaliacaoFisicaNova = avaliacaoFisica.orElseGet(()-> new AvaliacaoFisica());
        avaliacaoFisicaNova.setPeso(updateDTO.getPeso());
        avaliacaoFisicaNova.setAltura(updateDTO.getAltura());

        return avaliacaoFisicaRepository.save(avaliacaoFisicaNova);
    }

    @Override
    public void delete(Long id) {
        AvaliacaoFisica avaliacaoFisica = avaliacaoFisicaRepository
                .findById(id)
                .orElseThrow(()-> new RuntimeException("Aluno com ID " + id +" não encontrado"));
        avaliacaoFisicaRepository.delete(avaliacaoFisica);
    }
}
