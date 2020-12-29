package PagamentoBoleto;

import java.time.Instant;
import java.util.UUID;

public class Boleto {

    private String codigo;
    private Instant data;
    private double valor;

    public Boleto(Instant data, double valor) {
        this.codigo = UUID.randomUUID().toString();
        this.data = data;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
