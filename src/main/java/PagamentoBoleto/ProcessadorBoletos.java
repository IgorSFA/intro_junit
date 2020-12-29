package PagamentoBoleto;

import java.util.List;

public class ProcessadorBoletos {
    private Fatura fatura;

    public ProcessadorBoletos(Fatura fatura) {
        this.fatura = fatura;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void processa(List<Boleto> boletos) {
        double soma = 0;

        for (Boleto boleto : boletos) {
            soma += boleto.getValor();
        }

        if(soma >= this.fatura.getValor()){
            fatura.setPaga(true);
        }
    }
}
