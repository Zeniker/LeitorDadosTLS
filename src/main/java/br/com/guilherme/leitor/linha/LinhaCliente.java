package br.com.guilherme.leitor.linha;

import br.com.guilherme.leitor.modelo.Cliente;

/**
 * Classe utilizada para ler as linhas com dados de clientes
 */
public class LinhaCliente {

    /**
     * Lê uma string passada por parâmetro e extrai seus dados
     *
     * @param linha com os dados do vendedor
     */
    public void leLinha(String linha){
    }

    public Cliente getCliente(){
        return new Cliente("2345675434544345", "Jose da Silva", "Rural");
    }

}
