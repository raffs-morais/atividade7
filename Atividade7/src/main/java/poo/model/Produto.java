package poo.model;

public class Produto {
    private String id;
    private String nome;
    private double preco;
    private int quantidade;
    private String descricao;

    public Produto() {}

    public Produto(String id, String nome, double preco, int quantidade, String descricao) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.descricao = descricao;
    }

    public String getId() { return id; }
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getQuantidade() { return quantidade; }
    public String getDescricao() { return descricao; }

    public void setId(String id) { this.id = id; }
    public void setNome(String nome) { this.nome = nome; }
    public void setPreco(double preco) { this.preco = preco; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
}
