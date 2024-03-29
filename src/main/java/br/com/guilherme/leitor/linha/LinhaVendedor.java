package br.com.guilherme.leitor.linha;

import br.com.guilherme.leitor.dados.Armazenador;
import br.com.guilherme.leitor.modelo.Vendedor;

/**
 * Classe utilizada para ler as linhas com dados de vendedores
 */
public class LinhaVendedor extends LeitorLinha {

    /**
     * Lê uma string passada por parâmetro e extrai seus dados
     *
     * @param linha com os dados do vendedor
     */
    @Override
    public void leLinha(String linha){
        String[] colunas = this.separaLinhaEmColunas(linha);

        Armazenador.adicionaVendedor(new Vendedor(colunas[1], colunas[2], colunas[3]));
    }
}
