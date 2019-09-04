package br.com.guilherme.leitor.linha;

/**
 * Classe de abstração dos leitores
 */
public abstract class LeitorLinha {

    String[] separaLinhaEmColunas(String linha){
        return linha.split(";");
    }

    public abstract void leLinha(String linha);

}
