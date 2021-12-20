package Ex6;

import java.util.Scanner;

public class VendedorTester {

    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        System.out.println("Testando implementacao da classe Vendedor");
        System.out.println("---------------------------------------------");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do Vendedor: ");
        String nome = entrada.nextLine();
        System.out.println("Digite o endereco do Vendedor: ");
        String endereco = entrada.nextLine();
        System.out.println("Digite o telefone do Vendedor: ");
        String telefone = entrada.nextLine();

        System.out.println("Digite o codigo do setor do Vendedor: ");
        int codigoSetor = entrada.nextInt();
        System.out.println("Digite o salario base do Vendedor: ");
        double salarioBase = entrada.nextDouble();
        System.out.println("Digite o imposto sobre o salario do Vendedor: ");
        double imposto = entrada.nextDouble();
        System.out.println("Digite o valor total das vendas feitas pelo Vendedor: ");
        double valorVendas = entrada.nextDouble();
        System.out.println("Digite o valor da comissao do Vendedor: ");
        double comissao = entrada.nextDouble();

        System.out.println("---------------------------------------------");
        System.out.println("Criando Vendedor");
        System.out.println("---------------------------------------------");
        Vendedor vendedorTeste = new Vendedor(nome,endereco,telefone,codigoSetor, salarioBase,imposto,valorVendas,comissao);
        System.out.println("Vendedor criado: ");
        System.out.println(vendedorTeste);

        System.out.println("Salario liquido do Vendedor (ja com a comissao): " + vendedorTeste.calculaSalario());
    }
}
