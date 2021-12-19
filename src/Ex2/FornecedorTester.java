package Ex2;

import java.util.Scanner;

public class FornecedorTester {

    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        System.out.println("Testando implementacao da classe Fornecedor");
        System.out.println("---------------------------------------------");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do Fornecedor: ");
        String nome = entrada.nextLine();
        System.out.println("Digite o endereco do Fornecedor: ");
        String endereco = entrada.nextLine();
        System.out.println("Digite o telefone do Fornecedor: ");
        String telefone = entrada.nextLine();
        System.out.println("Digite o valor do credito do Fornecedor: ");
        double credito = entrada.nextDouble();

        System.out.println("Digite o valor da divida do Fornecedor: ");
        double divida = entrada.nextDouble();


        System.out.println("---------------------------------------------");
        System.out.println("Criando Fornecedor");
        System.out.println("---------------------------------------------");
        Fornecedor fornecedorTeste = new Fornecedor(nome,endereco,telefone,credito,divida);
        System.out.println("Fornecedor criado: ");
        System.out.println(fornecedorTeste);
        System.out.println("Saldo do fornecedor: " + fornecedorTeste.obterSaldo());
    }
}
