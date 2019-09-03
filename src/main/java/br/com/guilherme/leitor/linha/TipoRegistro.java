package br.com.guilherme.leitor.linha;

import br.com.guilherme.leitor.modelo.ModeloLinha;

import java.util.Arrays;
import java.util.Optional;

/**
 * Classe para definir o tipo de registro da linha
 */
public enum TipoRegistro {
    VENDEDOR("001", new LinhaVendedor()),
    CLIENTE("002", new LinhaCliente()),
    VENDA("003", new LinhaVenda());

    private final String tipo;
    private final LeitorLinha leitorLinha;

    TipoRegistro(String tipo, LeitorLinha leitorLinha){

        this.tipo = tipo;
        this.leitorLinha = leitorLinha;
    }

    public static TipoRegistro getTipoRegistro(String linha){
        String[] colunas = linha.split(";");

        Optional<TipoRegistro> tipoRegistroOptional = Arrays.stream(TipoRegistro.values())
                .filter(t -> t.tipo.equals(colunas[0])).findFirst();

        return tipoRegistroOptional.orElseThrow(() -> new RuntimeException("Tipo não encontrado"));
    }

    public ModeloLinha extraiModeloDaLinha(String linha){
        this.leitorLinha.leLinha(linha);
        return this.leitorLinha.getModeloUltimaLinhaLida();
    }
}
