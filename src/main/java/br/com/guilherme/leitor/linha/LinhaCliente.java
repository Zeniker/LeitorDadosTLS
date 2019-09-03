package br.com.guilherme.leitor.linha;

import br.com.guilherme.leitor.modelo.Cliente;

/**
 * Classe utilizada para ler as linhas com dados de clientes
 */
public class LinhaCliente {

    private Cliente cliente;

    /**
     * Lê uma string passada por parâmetro e extrai seus dados
     *
     * @param linha com os dados do vendedor
     */
    public void leLinha(String linha){
        String[] colunas = linha.split(";");

        cliente = new Cliente(colunas[1], colunas[2], colunas[3]);
    }

    /**
     * Retorna o cliente da última linha lida
     *
     * @return Cliente
     */
    public Cliente getCliente(){
        return this.cliente;
    }

}
