package Ex8;

public class Preguica extends Animal {

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    public void subirEmArvore() {
        System.out.println("Preguiça subindo em arvore");
    }

    @Override
    public void emitirSom() {
        System.out.println("Preguiça chiando");
    }
}
