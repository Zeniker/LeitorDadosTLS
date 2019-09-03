package br.com.guilherme.leitor.modelo;

public class Cliente {
    private final String CNPJ;
    private final String nome;
    private final String ramoAtividade;

    public Cliente(String CNPJ, String nome, String ramoAtividade) {
        this.CNPJ = CNPJ;
        this.nome = nome;
        this.ramoAtividade = ramoAtividade;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public String getNome() {
        return nome;
    }

    public String getRamoAtividade() {
        return ramoAtividade;
    }
}
