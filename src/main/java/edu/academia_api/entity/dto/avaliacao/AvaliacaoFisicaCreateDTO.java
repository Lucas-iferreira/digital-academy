package edu.academia_api.entity.dto.avaliacao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaCreateDTO {
    private Long alunoId;
    private double peso;
    private double altura;
}
