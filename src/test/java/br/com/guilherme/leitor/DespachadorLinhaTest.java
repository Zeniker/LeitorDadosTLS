package br.com.guilherme.leitor;

import br.com.guilherme.leitor.linha.TipoRegistro;
import br.com.guilherme.leitor.modelo.Vendedor;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DespachadorLinhaTest {

    @Test
    void despachaLinhaVendedorTest() {
        String linha = "001;1234567891234;Diego;5000.00";
        TipoRegistro tipoRegistro = TipoRegistro.getTipoRegistro(linha);
        Vendedor vendedor = tipoRegistro.extraiModeloDaLinha(linha);
        assertEquals("1234567891234", vendedor.getCPF());
        assertEquals("Diego", vendedor.getNome());
        assertEquals(new BigDecimal("5000.00"), vendedor.getSalario());
    }
}
