package br.com.guilherme.leitor.arquivo;

import br.com.guilherme.leitor.dados.Armazenador;
import br.com.guilherme.leitor.linha.LeitorRegistro;

import java.nio.file.Path;
import java.util.Scanner;

public class LeitorArquivo {

    private Path caminhoArquivo;

    public LeitorArquivo(Path caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }

    public void leArquivo() {
        try{
            Armazenador.iniciaArmazenamento();

            LeitorRegistro leitorRegistro = new LeitorRegistro();
            Scanner scanner = new Scanner(caminhoArquivo);
            scanner.useDelimiter(System.lineSeparator());

            while(scanner.hasNext()){
                String linhaArquivo = scanner.next();
                leitorRegistro.leRegistro(linhaArquivo);
            }

            scanner.close();

        }catch (Exception e){
            System.out.print("Não foi possível ler o arquivo " + e);
        }


    }
}
