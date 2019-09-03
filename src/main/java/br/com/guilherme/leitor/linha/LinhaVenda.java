package br.com.guilherme.leitor.linha;

import br.com.guilherme.leitor.modelo.Venda;

import java.math.BigDecimal;

/**
 * Classe utilizada para ler as linhas com dados de venda
 */
public class LinhaVenda {

    public void leLinha(String linha){

    }

    public Venda getVenda(){
        return new Venda(
                "10",
                "11010",
                new BigDecimal("300"),
                new BigDecimal("3403.30"),
                "Diego"
        );
    }
}
