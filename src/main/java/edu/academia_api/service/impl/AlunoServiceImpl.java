package edu.academia_api.service.impl;

import edu.academia_api.entity.Aluno;
import edu.academia_api.entity.AvaliacaoFisica;
import edu.academia_api.entity.dto.aluno.AlunoCreateDTO;
import edu.academia_api.entity.dto.aluno.AlunoUpdateDTO;
import edu.academia_api.infra.utils.JavaTimeUtils;
import edu.academia_api.repository.AlunoRepository;
import edu.academia_api.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class AlunoServiceImpl implements IAlunoService {
    @Autowired
    private AlunoRepository alunoRepository;
    @Override
    public List<Aluno> getAll(String dataDeNascimento) {
        if(dataDeNascimento==null){
        return alunoRepository.findAll();
        } else{
            LocalDate dataDeNascimentoInformada =LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
            return alunoRepository.findByDataDeNascimento(dataDeNascimentoInformada);
        }

    }

    @Override
    public Aluno getOne(Long id) {
        return alunoRepository.findById(id).get();
    }

    @Override
    public Aluno create(AlunoCreateDTO aluno) {
        Aluno alunoNovo = new Aluno();
        alunoNovo.setNome(aluno.getNome());
        alunoNovo.setCPF(aluno.getCpf());
        alunoNovo.setBairro(aluno.getBairro());
        alunoNovo.setDataDeNascimento(aluno.getDataDeNascimento());
        return alunoRepository.save(alunoNovo);
    }

    @Override
    public Aluno update(Long id, AlunoUpdateDTO aluno) {
       Optional<Aluno> updateAluno = alunoRepository.findById(id);

       Aluno alunoNovoUpdate = updateAluno.orElseGet(()-> new Aluno());
       alunoNovoUpdate.setNome(aluno.getNome());
       alunoNovoUpdate.setBairro(aluno.getBairro());
       alunoNovoUpdate.setDataDeNascimento(aluno.getDataDeNascimento());
        return alunoRepository.save(alunoNovoUpdate);
    }

    @Override
    public void delete(Long id) {
        Aluno aluno = alunoRepository
                .findById(id)
                .orElseThrow(()-> new RuntimeException("Aluno com ID " + id + " não encontrado"));
        alunoRepository.delete(aluno);
    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisica(Long id) {
        Aluno aluno = alunoRepository.findById(id).get();

        return aluno.getAvaliacoes();
    }


}
