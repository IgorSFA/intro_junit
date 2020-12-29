package PagamentoBoleto;

import java.time.Instant;

public class Fatura {

    private String nome;
    private double valor;
    private Instant data;
    private boolean paga;

    public Fatura(Instant data, double valor, String nome) {
        this.data = data;
        this.valor = valor;
        this.nome = nome;
    }

    public double getValor() {
        return this.valor;
    }

    public String getNome() {
        return nome;
    }

    public boolean foiPaga() {
        return paga;
    }

    public void setPaga(boolean paga) {
        this.paga = paga;
    }
}
