package br.com.guilherme.leitor.linha;

import br.com.guilherme.leitor.modelo.Venda;

import java.math.BigDecimal;

/**
 * Classe utilizada para ler as linhas com dados de venda
 */
public class LinhaVenda {

    private Venda venda;

    public void leLinha(String linha){
        String[] colunas = linha.split(";");

        venda = new Venda(colunas[1], colunas[2], colunas[3], colunas[4], colunas[5]);
    }

    public Venda getVenda(){
        return venda;
    }
}
