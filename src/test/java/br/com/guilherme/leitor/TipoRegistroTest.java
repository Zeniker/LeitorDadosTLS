package br.com.guilherme.leitor;

import br.com.guilherme.leitor.linha.TipoRegistro;
import br.com.guilherme.leitor.modelo.Cliente;
import br.com.guilherme.leitor.modelo.ModeloLinha;
import br.com.guilherme.leitor.modelo.Venda;
import br.com.guilherme.leitor.modelo.Vendedor;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TipoRegistroTest {


    private ModeloLinha getModeloLinha(String linha){
        TipoRegistro tipoRegistro = TipoRegistro.getTipoRegistro(linha);
        return tipoRegistro.extraiModeloDaLinha(linha);
    }

    @Test
    void despachaLinhaVendedorTest() {
        String linha = "001;1234567891234;Diego;5000.00";
        Vendedor vendedor = (Vendedor) getModeloLinha(linha);
        assertEquals("1234567891234", vendedor.getCPF());
        assertEquals("Diego", vendedor.getNome());
        assertEquals(new BigDecimal("5000.00"), vendedor.getSalario());
    }

    @Test
    void despachaLinhaVendaTest() {
        String linha = "003;10;11010;300;3403.30;Diego";
        Venda venda = (Venda) getModeloLinha(linha);
        assertEquals("10", venda.getIdVenda());
        assertEquals("11010", venda.getIdItem());
        assertEquals(new BigDecimal("300"), venda.getQuantidadeItem());
        assertEquals(new BigDecimal("3403.30"), venda.getValorItem());
        assertEquals("Diego", venda.getNomeVendedor());
    }

    @Test
    void despachaLinhaClienteTest() {
        String linha = "002;2345675434544345;Jose da Silva;Rural";
        Cliente cliente = (Cliente) getModeloLinha(linha);
        assertEquals("2345675434544345", cliente.getCNPJ());
        assertEquals("Jose da Silva", cliente.getNome());
        assertEquals("Rural", cliente.getRamoAtividade());
    }
}
