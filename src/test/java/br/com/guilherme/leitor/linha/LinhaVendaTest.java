package br.com.guilherme.leitor.linha;

import br.com.guilherme.leitor.modelo.Venda;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinhaVendaTest {

    @Test
    void getDadosVendaTest() {
        String linha = "003;10;11010;300;3403.30;Diego";
        LinhaVenda linhaCliente = new LinhaVenda();
        linhaCliente.leLinha(linha);
        Venda venda = (Venda) linhaCliente.getModeloUltimaLinhaLida();
        assertEquals("10", venda.getIdVenda());
        assertEquals("11010", venda.getIdItem());
        assertEquals(new BigDecimal("300"), venda.getQuantidadeItem());
        assertEquals(new BigDecimal("3403.30"), venda.getValorItem());
        assertEquals("Diego", venda.getNomeVendedor());
    }
}
