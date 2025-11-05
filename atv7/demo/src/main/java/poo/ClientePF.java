package poo;

import java.time.LocalDate;

public class ClientePF extends Cliente {
    private String cpf;
    private LocalDate dataNascimento;

    public ClientePF(String id, String nome, String email, String telefone, String cpf, LocalDate dataNascimento) {
        super(id, nome, email, telefone);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getCPF() {
        return cpf;
    }

    @Override
    public String getIdentificadorUnico() {
        return cpf;
    }
}
