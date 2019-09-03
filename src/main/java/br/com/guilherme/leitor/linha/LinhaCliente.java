package br.com.guilherme.leitor.linha;

import br.com.guilherme.leitor.modelo.Cliente;

/**
 * Classe utilizada para ler as linhas com dados de clientes
 */
public class LinhaCliente {

    private Cliente cliente;

    /**
     * L� uma string passada por par�metro e extrai seus dados
     *
     * @param linha com os dados do vendedor
     */
    public void leLinha(String linha){
        String[] colunas = linha.split(";");

        cliente = new Cliente(colunas[1], colunas[2], colunas[3]);
    }

    /**
     * Retorna o cliente da �ltima linha lida
     *
     * @return Cliente
     */
    public Cliente getCliente(){
        return this.cliente;
    }

}
