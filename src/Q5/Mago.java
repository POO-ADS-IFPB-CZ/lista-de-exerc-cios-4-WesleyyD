package Q5;

class Mago extends Personagem {
    Mago(String nome) {
        super(nome);
    }

    @Override
    void atacar() {
        System.out.println(nome + " lança uma magia e causa 70 de dano");
    }
}
