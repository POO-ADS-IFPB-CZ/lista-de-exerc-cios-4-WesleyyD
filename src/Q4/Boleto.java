package Q4;

public class Boleto extends Pagamento {
    @Override
    void processar(double valor) {
        double desconto = valor * 0.1;
        double total = valor - desconto;
        System.out.println("Pagamento via boleto: R$" + total + " (desconto de " + desconto + ")");
    }
}
