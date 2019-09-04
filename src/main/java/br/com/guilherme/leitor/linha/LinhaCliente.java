package br.com.guilherme.leitor.linha;

import br.com.guilherme.leitor.Armazenador;
import br.com.guilherme.leitor.modelo.Cliente;

/**
 * Classe utilizada para ler as linhas com dados de clientes
 */
public class LinhaCliente extends LeitorLinha {

    private Cliente cliente;

    /**
     * Lê uma string passada por parâmetro e extrai seus dados
     *
     * @param linha com os dados do vendedor
     */
    @Override
    public void leLinha(String linha){
        String[] colunas = this.separaLinhaEmColunas(linha);

        Armazenador.clientes.add(new Cliente(colunas[1], colunas[2], colunas[3]));
    }

}
