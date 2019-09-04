package br.com.guilherme.leitor.linha;

import br.com.guilherme.leitor.dados.Armazenador;
import br.com.guilherme.leitor.modelo.Cliente;

/**
 * Classe utilizada para ler as linhas com dados de clientes
 */
public class LinhaCliente extends LeitorLinha {

    /**
     * Lê uma string passada por parâmetro e extrai seus dados
     *
     * @param linha com os dados do vendedor
     */
    @Override
    public void leLinha(String linha){
        String[] colunas = this.separaLinhaEmColunas(linha);

        Armazenador.adicionaCliente(new Cliente(colunas[1], colunas[2], colunas[3]));
    }

}
