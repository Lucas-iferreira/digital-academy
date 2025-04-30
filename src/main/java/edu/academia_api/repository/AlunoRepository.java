package edu.academia_api.repository;

import edu.academia_api.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    List<Aluno>findByDataDeNascimento(LocalDate dataDeNascimento);
}
