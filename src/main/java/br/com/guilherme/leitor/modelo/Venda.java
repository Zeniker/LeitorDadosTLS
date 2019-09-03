package br.com.guilherme.leitor.modelo;

import java.math.BigDecimal;

public class Venda {
    private String idVenda;
    private String idItem;
    private BigDecimal quantidadeItem;
    private BigDecimal valorItem;
    private String nomeVendedor;

    public Venda(String idVenda, String idItem, BigDecimal quantidadeItem, BigDecimal valorItem, String nomeVendedor) {
        this.idVenda = idVenda;
        this.idItem = idItem;
        this.quantidadeItem = quantidadeItem;
        this.valorItem = valorItem;
        this.nomeVendedor = nomeVendedor;
    }

    public String getIdVenda() {
        return idVenda;
    }

    public String getIdItem() {
        return idItem;
    }

    public BigDecimal getQuantidadeItem() {
        return quantidadeItem;
    }

    public BigDecimal getValorItem() {
        return valorItem;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }
}
