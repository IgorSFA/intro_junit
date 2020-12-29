package PagamentoBoleto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Instant;

public class BoletoTest {

    @Test
    public void testBoletoCriado() {
        Boleto boleto = new Boleto(Instant.now(), 100.00);
        assertEquals(100.00, boleto.getValor());
    }
}
