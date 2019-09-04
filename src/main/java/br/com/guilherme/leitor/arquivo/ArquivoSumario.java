package br.com.guilherme.leitor.arquivo;

import br.com.guilherme.leitor.dados.Armazenador;
import org.apache.commons.io.FilenameUtils;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class ArquivoSumario {

    private static final String NOME_ARQUIVO_OUT = "./dados/out/%s.dat.proc";

    private final Path caminhoArquivo;

    public ArquivoSumario(Path caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }

    public void escrever(){
        String nomeArquivo = String.format(NOME_ARQUIVO_OUT,
                FilenameUtils.getBaseName(caminhoArquivo.toString()));

        try{
            FileWriter fileWriter = new FileWriter(nomeArquivo);

            montaLinha(fileWriter, "Quantidade de clientes: " + Armazenador.getTotalClientes());
            montaLinha(fileWriter, "Quantidade de vendedores: " + Armazenador.getTotalVendedores());
            montaLinha(fileWriter, "ID da venda de valor mais alto: " + Armazenador.getIdVendaValorMaisAlto());
            montaLinha(fileWriter, "Nome do vendedor que menos vendeu: " + Armazenador.getNomeVendedorVendaValorMaisBaixo());

            fileWriter.close();
        }catch (Exception e){
            System.out.print("Erro ao gravar arquivo" + nomeArquivo);
        }

    }

    private void montaLinha(FileWriter fileWriter, String texto) throws IOException {
        fileWriter.write(texto + System.lineSeparator());
    }
}
