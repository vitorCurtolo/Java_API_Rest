package med.voll.api.paciente;

import med.voll.api.endereco.Endereco;

public record DadosListagemPaciente(Long id, String nome, String telefone, String email, String cpf, Endereco endereco) {
    public DadosListagemPaciente(Paciente paciente) {
        this(paciente.getId(),paciente.getNome(),paciente.getTelefone(), paciente.getEmail(), paciente.getCpf(), paciente.getEndereco());
    }
}