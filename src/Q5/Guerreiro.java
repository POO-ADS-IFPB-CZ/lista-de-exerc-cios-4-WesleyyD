package Q5;

public class Guerreiro extends Personagem {
    Guerreiro(String nome) {
        super(nome);
    }

    @Override
    void atacar() {
        System.out.println(nome + " ataca com espada e causa 50 de dano");
    }
}
