package PagamentoBoleto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Instant;

public class FaturaTest {

    @Test
    public void testFaturaCriada() {
        Fatura fatura = new Fatura(Instant.now(), 1000.00, "John Doe");
        assertEquals(1000.00, fatura.getValor());
        assertEquals("John Doe", fatura.getNome());
    }
}
