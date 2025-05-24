package Q5;

public class App {
    public static void main(String[] args) {

        Personagem pesGuerreiro = new Guerreiro("Davi");
        Personagem pesMago = new Mago("Patolino");
        Personagem pesArqueiro = new Arqueiro("Jonas");

        System.out.println("--- Combate ---");
        pesArqueiro.atacar();
        pesMago.atacar();
        pesGuerreiro.atacar();
    }
}
