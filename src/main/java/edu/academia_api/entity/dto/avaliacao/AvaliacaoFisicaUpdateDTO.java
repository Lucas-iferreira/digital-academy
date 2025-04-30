package edu.academia_api.entity.dto.avaliacao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaUpdateDTO {
    private double peso;
    private double altura;
}
