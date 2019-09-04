package br.com.guilherme.leitor.linha;

import br.com.guilherme.leitor.modelo.ModeloLinha;

import java.util.Arrays;

public abstract class LeitorLinha {

    protected String[] separaLinhaEmColunas(String linha){
        return linha.split(";");
    }

    public abstract void leLinha(String linha);

}
