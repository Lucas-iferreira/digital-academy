package edu.academia_api.repository;

import edu.academia_api.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
    List<Matricula> findByAlunoBairro(String bairro);
}
