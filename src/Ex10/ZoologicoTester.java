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
