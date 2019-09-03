package br.com.guilherme.leitor.modelo;

/**
 * Classe de modelo do vendedor
 */
public class Vendedor {

    private String CPF;
    private String nome;
    private long salario;

    public Vendedor(String CPF, String nome, long salario) {
        this.CPF = CPF;
        this.nome = nome;
        this.salario = salario;
    }

    public String getCPF() {
        return CPF;
    }

    public String getNome() {
        return nome;
    }

    public long getSalario() {
        return salario;
    }
}
