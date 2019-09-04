package br.com.guilherme.leitor.arquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class BuscadorDeArquivos {

    public static List<Path> buscaArquivosDat() throws IOException {
        return Files.list(Paths.get("./dados/in"))
                    .filter(path -> path.toFile().isFile() && path.toString().endsWith(".dat"))
                    .collect(Collectors.toList());
    }
}
