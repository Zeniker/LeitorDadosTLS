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

    @Test
    void getIdVendaValorMaisAltoTest_QuantidadesIguais() {
        Armazenador.iniciaArmazenamento();
        LeitorRegistro leitorRegistro = new LeitorRegistro();

        String linha = "003;11;1;1;3500;Diego";
        leitorRegistro.leRegistro(linha);

        linha = "003;10;1;1;3403.30;Diego";
        leitorRegistro.leRegistro(linha);

        linha = "003;09;1;1;3499;Diego";
        leitorRegistro.leRegistro(linha);

        String idVenda = Armazenador.getIdVendaValorMaisAlto();
        assertEquals("11", idVenda);
    }

    @Test
    void getIdVendaValorMaisAltoTest_QuantidadesDiferentes() {
        Armazenador.iniciaArmazenamento();
        LeitorRegistro leitorRegistro = new LeitorRegistro();

        String linha = "003;10;1;1;6000;Diego";
        leitorRegistro.leRegistro(linha);

        linha = "003;11;1;2;3500;Diego";
        leitorRegistro.leRegistro(linha);

        linha = "003;09;1;3;1900;Diego";
        leitorRegistro.leRegistro(linha);


        String idVenda = Armazenador.getIdVendaValorMaisAlto();
        assertEquals("11", idVenda);
    }

    @Test
    void getNomeVendedorVendaMaisBaixa_QuantidadesIguais() {
        Armazenador.iniciaArmazenamento();
        LeitorRegistro leitorRegistro = new LeitorRegistro();

        String linha = "003;10;1;1;6000;Diego";
        leitorRegistro.leRegistro(linha);

        linha = "003;11;1;1;3500;Rafael";
        leitorRegistro.leRegistro(linha);

        linha = "003;09;1;1;3501;Jorge";
        leitorRegistro.leRegistro(linha);


        String idVenda = Armazenador.getNomeVendedorVendaValorMaisBaixo();
        assertEquals("Rafael", idVenda);
    }

    @Test
    void getNomeVendedorVendaMaisBaixa_QuantidadesDiferentes() {
        Armazenador.iniciaArmazenamento();
        LeitorRegistro leitorRegistro = new LeitorRegistro();

        String linha = "003;10;1;1;6000;Diego";
        leitorRegistro.leRegistro(linha);

        linha = "003;11;1;2;100;Rafael";
        leitorRegistro.leRegistro(linha);

        linha = "003;09;1;3;90;Jorge";
        leitorRegistro.leRegistro(linha);


        String idVenda = Armazenador.getNomeVendedorVendaValorMaisBaixo();
        assertEquals("Rafael", idVenda);
    }
}
