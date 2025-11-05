package poo;

import java.time.LocalDate;

public class PagamentoBoleto implements IPagamento {
    private String codigoBarras;
    private LocalDate dataVencimento;
    private double valor;
    private StatusPagamento statusPagamento;

    public PagamentoBoleto(String codigoBarras, LocalDate dataVencimento, double valor) {
        this.codigoBarras = codigoBarras;
        this.dataVencimento = dataVencimento;
        this.valor = valor;
        this.statusPagamento = StatusPagamento.PENDENTE;
    }

    @Override
    public boolean processarPagamento(double valor) {
        this.statusPagamento = StatusPagamento.APROVADO;
        return true;
    }

    @Override
    public StatusPagamento getStatus() {
        return statusPagamento;
    }
}