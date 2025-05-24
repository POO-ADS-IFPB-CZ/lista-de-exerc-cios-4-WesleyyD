package Q5;

public abstract class Personagem {
    String nome;

    Personagem(String nome) {
        this.nome = nome;
    }

    abstract void atacar();
}
