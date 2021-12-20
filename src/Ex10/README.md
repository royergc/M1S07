## Ex 10 - Implemente a classe Zoologico

Crie uma classe Zoologico, com 10 jaulas (utilize um array) coloque em cada jaula um animal diferente, percorra cada jaula e emita o som e, se o tipo de animal possuir o comportamento, faça-o correr. Escreva um programa de teste adequado para esta classe.

## Solucao:

A solução para o exercício encontra-se no meu [GitHub](https://github.com/royergc), no repositório [M1S07 - Ex10](https://github.com/royergc/M1S07/tree/main/src/Ex10)

Implementei a classe Zoologico com um atributo privado jaulas que é um array de 10 objetos do tipo Animal.

No construtor do Zoologico eu apenas instancio esse array.
Criei um metodo preencheJaulas que coloca um animal de cada tipo nas jaulas, preenchendo todas.
Criei um metodo percorreJaulas que percorre o array, chamando o metodo emitirSom de cada Animal e checa se o Animal é do tipo
Cachorro ou Cavalo, se for, chama o metodo correr() também.

O codigo ficou assim:

Classe *Zoologico.java*
```
package Ex10;

import Ex8.Animal;
import Ex8.Cachorro;
import Ex8.Cavalo;
import Ex8.Preguica;

public class Zoologico {

    private Animal[] jaulas;

    public Zoologico() {
       jaulas = new Animal[10];
    }

    public void preencheJaulas() {
        jaulas[0] = new Cachorro("Toby", 5);
        jaulas[1] = new Cavalo("Apolo", 6);
        jaulas[2] = new Preguica("Guilherme",2);
        jaulas[3] = new Cavalo("Trovao", 9);
        jaulas[4] = new Preguica("Soneca", 1);
        jaulas[5] = new Cachorro("Totoh", 4);
        jaulas[6] = new Preguica("Dorminhoco",5);
        jaulas[7] = new Cachorro("Princesa", 11);
        jaulas[8] = new Cavalo("Alazao", 7);
        jaulas[9] = new Preguica("Lento",2);
    }

    public void percorreJaulas() {
        for(Animal bicho : jaulas) {
            bicho.emitirSom();
            if(bicho instanceof Cachorro) {
                ((Cachorro) bicho).correr();
            }

            if(bicho instanceof Cavalo) {
               ((Cavalo) bicho).correr();
            }
        }
    }
}
```

Implementei então uma classe ZoologicoTester para testar essa classe Zoologico. Ela basicamente instancia um Zoologico e chama os metodos preencherJaulas e percorrerJaulas para verificar o resultado.
O código ficou assim:

Classe *ZoologicoTester.java*
```
package Ex10;

public class ZoologicoTester {

    public static void main(String[] args) {
        System.out.println("Criando Zoologico");
        Zoologico zoo = new Zoologico();
        System.out.printf("Preenchendo jaulas do Zoologico");
        zoo.preencheJaulas();
        System.out.println("Percorrendo as jauas e emitindo som (e correndo, quando o bicho correr)");
        zoo.percorreJaulas();
    }
}
```

A saida do tester ficou assim:
```
Criando Zoologico
Preenchendo jaulas do ZoologicoPercorrendo as jauas e emitindo som (e correndo, quando o bicho correr)
Cachorro latindo
Cachorro correndo
Cavalo relinchando
Cavalo correndo
Preguiça chiando
Cavalo relinchando
Cavalo correndo
Preguiça chiando
Cachorro latindo
Cachorro correndo
Preguiça chiando
Cachorro latindo
Cachorro correndo
Cavalo relinchando
Cavalo correndo
Preguiça chiando
```