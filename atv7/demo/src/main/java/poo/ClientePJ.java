package poo;

public class ClientePJ extends Cliente {
    private String cnpj;
    private String razaoSocial;
    private String inscricaoEstadual;

    public ClientePJ(String id, String nome, String email, String telefone, String cnpj, String razaoSocial, String inscricaoEstadual) {
        super(id, nome, email, telefone);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCNPJ() {
        return cnpj;
    }

    @Override
    public String getIdentificadorUnico() {
        return cnpj;
    }
}