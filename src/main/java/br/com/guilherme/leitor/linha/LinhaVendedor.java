package br.com.guilherme.leitor.linha;

import br.com.guilherme.leitor.modelo.Vendedor;

/**
 * Classe utilizada para ler as linhas com dados de vendedores
 */
public class LinhaVendedor {

    /**
     * @param linha com os dados do vendedor
     */
    public void leLinha(String linha){

    }

    public Vendedor getVendedor(){
        return new Vendedor("1234567891234", "Diego", 5000);
    }
}
