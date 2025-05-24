package Q4;

public class Pix extends Pagamento {
    @Override
    void processar(double valor) {
        double taxa = 1.00;
        double total = valor + taxa;
        System.out.println("Pagamento com pix: R$" + total + " (taxa de " + taxa + ")");
    }
}
