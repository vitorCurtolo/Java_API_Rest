package med.voll.api.paciente;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPaciente(

        @NotNull
        Long id,
        String nome,
        String telefone

) {
}
