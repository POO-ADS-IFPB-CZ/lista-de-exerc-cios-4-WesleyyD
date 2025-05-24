package Q4;

public class CartaoCredito extends Pagamento {
    @Override
    void processar(double valor) {
        double taxa = valor * 0.05;
        double total = valor + taxa;
        System.out.println("Pagamento com cartão de crédito: " + total + " (taxa de " + taxa + ")");
    }
}
