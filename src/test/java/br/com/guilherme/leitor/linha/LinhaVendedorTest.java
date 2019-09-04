package br.com.guilherme.leitor.linha;

import br.com.guilherme.leitor.dados.Armazenador;
import br.com.guilherme.leitor.modelo.Vendedor;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinhaVendedorTest {

    @Test
    void getDadosVendedorTest() {
        Armazenador.iniciaArmazenamento();
        String linha = "001;1234567891234;Diego;5000.00";
        LinhaVendedor linhaVendedor = new LinhaVendedor();
        linhaVendedor.leLinha(linha);
        Vendedor vendedor = Armazenador.getVendedores().get(0);
        assertEquals("1234567891234", vendedor.getCPF());
        assertEquals("Diego", vendedor.getNome());
        assertEquals(new BigDecimal("5000.00"), vendedor.getSalario());
    }
}
