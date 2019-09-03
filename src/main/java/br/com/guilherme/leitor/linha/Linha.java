package br.com.guilherme.leitor.linha;

import java.util.Arrays;

public abstract class Linha {

    protected String[] separaLinhaEmColunas(String linha){
        return linha.split(";");
    }
}
