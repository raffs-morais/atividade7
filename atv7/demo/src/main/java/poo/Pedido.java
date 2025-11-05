package poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private LocalDate data;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private IPagamento metodoPagamento;
    private StatusPedido statusPedido;

    public Pedido(Cliente cliente) {
        this.data = LocalDate.now();
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.statusPedido = StatusPedido.PENDENTE;
    }

    public void adicionarItem(Produto produto, int quantidade) {
        for (ItemPedido item : itens) {
            if (item.getProduto().equals(produto)) {
                quantidade += item.getQuantidade();
                return;
            }
        }
        itens.add(new ItemPedido(produto, quantidade));
    }

    public void removerItem(ItemPedido item) {
        itens.remove(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public double aplicarDesconto(double desconto) {
        double total = calcularTotal();
        return total - desconto;
    }

    public boolean confirmarPedido() {
        if (statusPedido != StatusPedido.PENDENTE || metodoPagamento == null) {
            return false;
        }
        boolean pago = metodoPagamento.processarPagamento(calcularTotal());
        if (pago) {
            statusPedido = StatusPedido.PROCESSANDO;
        }
        return pago;
    }

    public void setMetodoPagamento(IPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }
}