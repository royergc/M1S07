package Ex8;

public class AnimaisTester {

    public static void main(String[] args) {
        System.out.println("-------------------------------");
        System.out.println(" Criando 1 cachorro (Toby, 6 anos), 1 cavalo (Apolo, 4 anos) e 1 preguiça (Guilherme, 2 anos)");
        Cachorro dog = new Cachorro("Toby", 6);
        Cavalo horse = new Cavalo("Apolo", 4);
        Preguica lazy = new Preguica("Guilherme", 2);

        System.out.println("-----------------------------");
        System.out.println("Fazendo o cachorro latir com o metodo emitirsom()");
        dog.emitirSom();

        System.out.println("-----------------------------");
        System.out.println("Fazendo o cavalo relinchar com o metodo emitirsom()");
        horse.emitirSom();

        System.out.println("-----------------------------");
        System.out.println("Fazendo o preguica emitir som com o metodo emitirsom()");
        lazy.emitirSom();
    }
}
