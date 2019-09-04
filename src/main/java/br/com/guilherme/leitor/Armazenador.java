package br.com.guilherme.leitor;

import br.com.guilherme.leitor.modelo.Cliente;
import br.com.guilherme.leitor.modelo.Venda;
import br.com.guilherme.leitor.modelo.Vendedor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Classe para armazenadar tudo que foi lido no arquivo
 */
public class Armazenador {

    private static List<Vendedor> vendedores;
    private static List<Cliente> clientes;
    private static List<Venda> vendas;
    private static Venda vendaValorMaisAlto;
    private static Venda vendaValorMaisBaixo;

    /**
     * Inicializa as variáveis de armazenamento
     */
    public static void iniciaArmazenamento(){
        vendedores = new ArrayList<>();
        clientes = new ArrayList<>();
        vendas = new ArrayList<>();
        vendaValorMaisAlto = null;
        vendaValorMaisBaixo = null;
    }

    /**
     * Retorna os vendedores armazenados
     *
     * @return List<Vendedor>
     */
    public static List<Vendedor> getVendedores() {
        return vendedores;
    }

    /**
     * Retorna os clientes armazenados
     *
     * @return List<Cliente>
     */
    public static List<Cliente> getClientes() {
        return clientes;
    }

    /**
     * Retorna as vendas armazenadas
     *
     * @return List<Venda>
     */
    public static List<Venda> getVendas() {
        return vendas;
    }

    /**
     * Retorna o total de clientes armazenados
     *
     * @return int
     */
    public static int getTotalClientes(){
        return clientes.size();
    };

    /**
     * Retorna o total de vendedores armazenados
     *
     * @return int
     */
    public static int getTotalVendedores() {
        return vendedores.size();
    }

    /**
     * Retorna o id da venda de valor mais alto
     *
     * @return String
     */
    public static String getIdVendaValorMaisAlto() {
        return vendaValorMaisAlto.getIdVenda();
    }

    /**
     * Adiciona um vendedor para a lista de vendedores
     *
     * @param vendedor
     */
    public static void adicionaVendedor(Vendedor vendedor){
        vendedores.add(vendedor);
    }

    /**
     * Adiciona um cliente para a lista de clientes
     *
     * @param cliente
     */
    public static void adicionaCliente(Cliente cliente){
        clientes.add(cliente);
    }

    /**
     * Adiciona uma venda para a lista de vendas
     *
     * @param venda
     */
    public static void adicionaVenda(Venda venda){
        vendas.add(venda);

        if(isValorNovaVendaMaior(venda)){
            vendaValorMaisAlto = venda;
        }

        if(isValorNovaVendaMenor(venda)){
            vendaValorMaisBaixo = venda;
        }
    }

    private static boolean isValorNovaVendaMaior(Venda venda){
        if(vendaValorMaisAlto == null){
            return true;
        }

        return vendaValorMaisAlto.getValorTotal().compareTo(venda.getValorTotal()) < 0;
    }

    private static boolean isValorNovaVendaMenor(Venda venda){
        if(vendaValorMaisBaixo == null){
            return true;
        }

        return vendaValorMaisBaixo.getValorTotal().compareTo(venda.getValorTotal()) > 0;
    }

    /**
     * Retorna o nome do vendedor que menos vendeu
     *
     * @return String
     */
    public static String getNomeVendedorVendaValorMaisBaixo() {
        return vendaValorMaisBaixo.getNomeVendedor();
    }
}
