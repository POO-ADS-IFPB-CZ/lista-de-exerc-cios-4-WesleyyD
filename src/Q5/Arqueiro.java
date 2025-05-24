package Q5;

class Arqueiro extends Personagem {
    Arqueiro(String nome) {
        super(nome);
    }

    @Override
    void atacar() {
        System.out.println(nome + " dispara uma flecha e causa 40 de dano");
    }
}
