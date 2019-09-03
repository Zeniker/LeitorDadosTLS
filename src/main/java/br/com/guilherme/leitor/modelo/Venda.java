package br.com.guilherme.leitor.modelo;

import java.math.BigDecimal;

/**
 * Classe de modelo da venda
 */
public class Venda implements ModeloLinha  {
    private String idVenda;
    private String idItem;
    private BigDecimal quantidadeItem;
    private BigDecimal valorItem;
    private String nomeVendedor;

    public Venda(String idVenda, String idItem, String quantidadeItem, String valorItem, String nomeVendedor) {
        this.idVenda = idVenda;
        this.idItem = idItem;
        this.quantidadeItem = new BigDecimal(quantidadeItem);
        this.valorItem = new BigDecimal(valorItem);
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
