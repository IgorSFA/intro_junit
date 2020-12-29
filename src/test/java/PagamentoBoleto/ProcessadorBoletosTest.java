package PagamentoBoleto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ProcessadorBoletosTest {
    Fatura fatura;
    ProcessadorBoletos processador;

    @BeforeEach
    public void inicializa() {
        fatura = new Fatura(Instant.now(), 1500, "John Doe");
    }


    @Test
    public void processadorBoletosCriado() {
        ProcessadorBoletos processador = new ProcessadorBoletos(fatura);

        assertEquals(fatura, processador.getFatura());
    }

    @Test
    public void processaFatura1500com3BoletosPaga() {
        Boleto boleto1 = new Boleto(Instant.now(), 500);
        Boleto boleto2 = new Boleto(Instant.now(), 400);
        Boleto boleto3 = new Boleto(Instant.now(), 600);
        List<Boleto> boletos = new ArrayList<>();
        boletos.add(boleto1);
        boletos.add(boleto2);
        boletos.add(boleto3);
        ProcessadorBoletos processador = new ProcessadorBoletos(fatura);

        processador.processa(boletos);

        assertTrue(fatura.foiPaga());
    }

        @Test
    public void processaFatura2000com2BoletosNaoPaga() {
        fatura = new Fatura(Instant.now(), 2000, "John Doe");
        Boleto boleto1 = new Boleto(Instant.now(), 500);
        Boleto boleto2 = new Boleto(Instant.now(), 400);
        List<Boleto> boletos = new ArrayList<>();
        boletos.add(boleto1);
        boletos.add(boleto2);
        ProcessadorBoletos processador = new ProcessadorBoletos(fatura);

        processador.processa(boletos);

        assertFalse(fatura.foiPaga());
    }

}
