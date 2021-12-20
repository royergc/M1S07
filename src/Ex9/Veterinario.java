package Ex9;

import Ex8.Animal;

public class Veterinario {


    public void examinar(Animal animal) {
        System.out.println("Veterinario exanimando o " + animal.getNome() + ", que está prestes a emitir um som");
        animal.emitirSom();
    }
}
