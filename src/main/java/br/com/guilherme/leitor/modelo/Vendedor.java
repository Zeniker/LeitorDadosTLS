package br.com.guilherme.leitor.modelo;

import java.math.BigDecimal;

/**
 * Classe de modelo do vendedor
 */
public class Vendedor {

    private final String CPF;
    private final String nome;
    private final BigDecimal salario;

    public Vendedor(String CPF, String nome, String salario) {
        this.CPF = CPF;
        this.nome = nome;
        this.salario = new BigDecimal(salario);
    }

    public String getCPF() {
        return CPF;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }
}
