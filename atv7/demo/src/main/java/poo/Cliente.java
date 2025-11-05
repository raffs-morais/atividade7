package poo;

public abstract class Cliente {
    protected String nome;
    protected String email;
    protected String id;
    protected String telefone;

    public Cliente(String id, String nome, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getId() {
        return id;
    }

    public String getTelefone() {
        return telefone;
    }

    public abstract String getIdentificadorUnico();
}
