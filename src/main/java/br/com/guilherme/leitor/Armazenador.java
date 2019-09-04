package br.com.guilherme.leitor;

import br.com.guilherme.leitor.modelo.Cliente;
import br.com.guilherme.leitor.modelo.Venda;
import br.com.guilherme.leitor.modelo.Vendedor;

import java.util.ArrayList;
import java.util.List;

public class Armazenador {

    public static List<Vendedor> vendedores;
    public static List<Cliente> clientes;
    public static List<Venda> vendas;

    public static void iniciaArmazenamento(){
        vendedores = new ArrayList<>();
        clientes = new ArrayList<>();
        vendas = new ArrayList<>();
    }

}
