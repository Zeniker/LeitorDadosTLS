package br.com.guilherme.leitor.linha;

import br.com.guilherme.leitor.modelo.Vendedor;

public enum TipoRegistro {
    VENDEDOR("001", new LinhaVendedor());

    private final String tipo;
    private final LeitorLinha leitorLinha;

    TipoRegistro(String tipo, LeitorLinha leitorLinha){

        this.tipo = tipo;
        this.leitorLinha = leitorLinha;
    }

    public static TipoRegistro getTipoRegistro(String linha){
        return TipoRegistro.VENDEDOR;
    }

    public Vendedor extraiModeloDaLinha(String linha){
        this.leitorLinha.leLinha(linha);
        return (Vendedor) this.leitorLinha.getModeloUltimaLinhaLida();
    }
}
