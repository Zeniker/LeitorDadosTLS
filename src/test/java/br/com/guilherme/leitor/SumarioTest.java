package br.com.guilherme.leitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumarioTest {

    @Test
    void getTotalClientesTest() {
        Armazenador.iniciaArmazenamento();
        LeitorRegistro leitorRegistro = new LeitorRegistro();

        String linha = "002;2345675434544345;Jose da Silva;Rural";
        leitorRegistro.leRegistro(linha);

        linha = "002;2345675434544345;Jose da Silva;Rural";
        leitorRegistro.leRegistro(linha);


        int totalClientes = Armazenador.getTotalClientes();
        assertEquals(2, totalClientes);
    }

    @Test
    void getTotalVendedoresTest() {
        Armazenador.iniciaArmazenamento();
        LeitorRegistro leitorRegistro = new LeitorRegistro();

        String linha = "001;1234567891234;Diego;5000.00";
        leitorRegistro.leRegistro(linha);

        linha = "001;1234567891234;Diego;5000.00";
        leitorRegistro.leRegistro(linha);


        int totalClientes = Armazenador.getTotalVendedores();
        assertEquals(2, totalClientes);
    }
}
