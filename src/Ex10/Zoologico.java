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
