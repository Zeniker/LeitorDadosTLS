package br.com.guilherme.leitor.linha;

import br.com.guilherme.leitor.modelo.Vendedor;

/**
 * Classe utilizada para ler as linhas com dados de vendedores
 */
public class LinhaVendedor {

    private Vendedor vendedor;

    /**
     * L� uma string passada por par�metro e extrai seus dados
     *
     * @param linha com os dados do vendedor
     */
    public void leLinha(String linha){
        String[] colunas = linha.split(";");

        vendedor = new Vendedor(colunas[1], colunas[2], colunas[3]);
    }

    /**
     * Busca o vendedor da �ltima linha lida
     *
     * @return Vendedor
     */
    public Vendedor getVendedor(){
        return this.vendedor;
    }
}
