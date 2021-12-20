package Ex5;

import java.util.Scanner;

public class OperarioTester {

    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        System.out.println("Testando implementacao da classe Operario");
        System.out.println("---------------------------------------------");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do Operario: ");
        String nome = entrada.nextLine();
        System.out.println("Digite o endereco do Operario: ");
        String endereco = entrada.nextLine();
        System.out.println("Digite o telefone do Operario: ");
        String telefone = entrada.nextLine();

        System.out.println("Digite o codigo do setor do Operario: ");
        int codigoSetor = entrada.nextInt();
        System.out.println("Digite o salario base do Operario: ");
        double salarioBase = entrada.nextDouble();
        System.out.println("Digite o imposto sobre o salario do Operario: ");
        double imposto = entrada.nextDouble();
        System.out.println("Digite o valor dos artigos produzidos pelo Operario: ");
        double valorProducao = entrada.nextDouble();
        System.out.println("Digite o valor da comissao do Operario: ");
        double comissao = entrada.nextDouble();

        System.out.println("---------------------------------------------");
        System.out.println("Criando Operario");
        System.out.println("---------------------------------------------");
        Operario operarioTeste = new Operario(nome,endereco,telefone,codigoSetor, salarioBase,imposto,valorProducao,comissao);
        System.out.println("Operario criado: ");
        System.out.println(operarioTeste);

        System.out.println("Salario liquido do Operario (ja com a comissao): " + operarioTeste.calculaSalario());
    }
}

