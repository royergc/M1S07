# Ex 8 - Implemente um programa de teste adequado

Implemente um programa que crie os 3 tipos de animais definidos no exercício anterior e invoque o método que emite o som de cada um de forma polimórfica, isto é, independente do tipo de animal. Escreva um programa de teste adequado para esta classe.

## Solução
A solução para o exercício encontra-se no meu [GitHub](https://github.com/royergc), no repositório [M1S07 - Ex8](https://github.com/royergc/M1S07/tree/main/src/Ex8)
Modifiquei as classes Cachorro, Cavalo e Preguica, sobrescrevendo o metodo emitirSom() de Animal para que cada um emitisse um som proprio.

As classes ficaram assim:

Classe *Animal.java*
```aidl
package Ex8;

public abstract class Animal {

    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println(getClass().getName() + "emitindo som");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
```

Classe *Cachorro.java*
```aidl
package Ex8;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    public void correr() {
        System.out.println("Cachorro correndo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Cachorro latindo");
    }
}
```

Classe *Cavalo.java*
```aidl
package Ex8;

public class Cavalo extends Animal {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    public void correr() {
        System.out.println("Cavalo correndo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Cavalo relinchando");
    }
}
```

Classe *Preguiça.java*
```aidl
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
```

Por fim, criei a classe para testar essa implementação. Ela basicamente cria um animal de cada tipo e chama o metodo emitirSom() para cada animal:

Classe *AnimaisTester.java*
```aidl
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
```