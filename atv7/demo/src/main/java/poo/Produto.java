package poo;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;
    private String id;
    private String descricao;

    public Produto(String id, String nome, double preco, int estoque, String descricao) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public double getPreco() {
        return preco;
    }

    public void adicionarEstoque(int quantidade) {
        this.estoque += quantidade;
    }
}