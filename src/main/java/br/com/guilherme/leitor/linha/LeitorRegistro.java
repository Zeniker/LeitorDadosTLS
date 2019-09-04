package br.com.guilherme.leitor.linha;

public class LeitorRegistro {

    public void leRegistro(String linha){
        TipoRegistro tipoRegistro = TipoRegistro.getTipoRegistro(linha);
        tipoRegistro.getLeitorLinha().leLinha(linha);
    }
}
