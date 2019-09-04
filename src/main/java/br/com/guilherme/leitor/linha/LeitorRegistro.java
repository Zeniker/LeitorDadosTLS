package br.com.guilherme.leitor.linha;

import br.com.guilherme.leitor.linha.TipoRegistro;
import br.com.guilherme.leitor.modelo.ModeloLinha;

public class LeitorRegistro {

    public void leRegistro(String linha){
        TipoRegistro tipoRegistro = TipoRegistro.getTipoRegistro(linha);
        tipoRegistro.getLeitorLinha().leLinha(linha);
    }
}
