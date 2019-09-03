package br.com.guilherme.leitor.linha;

import br.com.guilherme.leitor.linha.LinhaCliente;
import br.com.guilherme.leitor.modelo.Cliente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinhaClienteTest {

    @Test
    void getDadosClienteTest() {
        String linha = "002;2345675434544345;Jose da Silva;Rural";
        LinhaCliente linhaCliente = new LinhaCliente();
        linhaCliente.leLinha(linha);
        Cliente cliente = linhaCliente.getCliente();
        assertEquals("2345675434544345", cliente.getCNPJ());
        assertEquals("Jose da Silva", cliente.getNome());
        assertEquals("Rural", cliente.getRamoAtividade());
    }
}
