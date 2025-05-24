package Q4;

public class App {
    public static void main(String[] args) {

        Pagamento pagCartao = new CartaoCredito();
        Pagamento pagBoleto = new Boleto();
        Pagamento pagPix = new Pix();

        pagCartao.processar(100.00);
        pagBoleto.processar(100.00);
        pagPix.processar(100.00);
    }
}
