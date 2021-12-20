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
