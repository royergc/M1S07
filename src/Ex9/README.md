## Ex9 - Implementa a classe Veterinario

Implemente uma classe Veterinario que contenha um método examinar() passando como parâmetro de entrada um Animal, quando o animal é examinado ele deve emitir um som, passe os 3 animais com parâmetro. Escreva um programa de teste adequado para esta classe.

## Solução
A solução para o exercício encontra-se no meu [GitHub](https://github.com/royergc), no repositório [M1S07 - Ex9](https://github.com/royergc/M1S07/tree/main/src/Ex9)
Implementei a classe Veterinario apenas com o metodo examinar, sem nenhum atributo.
O Metodo examinar recebe como parametro um Animal e chama o metodo emitirSom() desse animal.

O codigo ficou assim:

Classe *Veterinario.java*
```
package Ex9;

import Ex8.Animal;

public class Veterinario {


    public void examinar(Animal animal) {
        System.out.println("Veterinario exanimando o " + animal.getNome() + ", que está prestes a emitir um som");
        animal.emitirSom();
    }
}
```

Depois disso, implementei uma classe que testar o examinar do Veterinario, passando um Cachorro, um Cavalo e um Preguica.
O tester ficou assim:

```
package Ex9;

import Ex8.Cachorro;
import Ex8.Cavalo;
import Ex8.Preguica;

public class VeterinarioTester {

    public static void main(String[] args) {
        Veterinario vet = new Veterinario();
        Cachorro dog = new Cachorro("Toby", 4);
        vet.examinar(dog);

        Cavalo horse = new Cavalo("Apolo", 3);
        vet.examinar(horse);

        Preguica lazy = new Preguica("Guilherme", 2);
        vet.examinar(lazy);
    }
}
```

O resultado ao rodar a classe Tester ficou assim:
```
Veterinario exanimando o Toby, que está prestes a emitir um som
Cachorro latindo
Veterinario exanimando o Apolo, que está prestes a emitir um som
Cavalo relinchando
Veterinario exanimando o Guilherme, que está prestes a emitir um som
Preguiça chiando
```

