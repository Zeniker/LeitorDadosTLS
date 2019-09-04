package br.com.guilherme.leitor;

import br.com.guilherme.leitor.arquivo.ArquivoSumario;
import br.com.guilherme.leitor.arquivo.BuscadorDeArquivos;
import br.com.guilherme.leitor.arquivo.LeitorArquivo;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class Aplicacao {

    public static void main(String[] args) throws Exception{
        try{
            List<Path> arquivos = BuscadorDeArquivos.buscaArquivosDat();

            arquivos.forEach(arquivo -> {
                new LeitorArquivo(arquivo).leArquivo();
                new ArquivoSumario(arquivo).escrever();
            });
        }catch (Exception e){
            System.out.println("Não foi possível encontrar a pasta com arquivos");
        }

    }


}
