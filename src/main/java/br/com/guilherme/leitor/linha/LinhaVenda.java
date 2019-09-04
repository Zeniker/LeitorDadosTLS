package br.com.guilherme.leitor.linha;

import br.com.guilherme.leitor.dados.Armazenador;
import br.com.guilherme.leitor.modelo.Venda;

/**
 * Classe utilizada para ler as linhas com dados de venda
 */
public class LinhaVenda extends LeitorLinha {

    /**
     * Lê uma string passada por parâmetro e extrai seus dados
     *
     * @param linha
     */
    @Override
    public void leLinha(String linha){
        String[] colunas = this.separaLinhaEmColunas(linha);

        Armazenador.adicionaVenda(new Venda(colunas[1], colunas[2], colunas[3], colunas[4], colunas[5]));
    }
}
