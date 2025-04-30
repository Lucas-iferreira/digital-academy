package edu.academia_api.entity.dto.matricula;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatriculaCreateDTO {
    @NotNull(message = "Preencha o campo corretamente")
    @Positive(message = "Somente numeros positivos")
    private Long alunoId;

}
