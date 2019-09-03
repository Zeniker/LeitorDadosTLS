package br.com.guilherme.leitor.linha;

import br.com.guilherme.leitor.modelo.Cliente;
import br.com.guilherme.leitor.modelo.ModeloLinha;

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

        cliente = new Cliente(colunas[1], colunas[2], colunas[3]);
    }

    /**
     * Retorna o cliente da última linha lida
     *
     * @return Cliente
     */
    @Override
    public ModeloLinha getModeloUltimaLinhaLida(){
        return this.cliente;
    }

}
