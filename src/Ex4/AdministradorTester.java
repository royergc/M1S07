package Ex4;

import java.util.Scanner;

public class AdministradorTester {

    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        System.out.println("Testando implementacao da classe Administrador");
        System.out.println("---------------------------------------------");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do Adminstrador: ");
        String nome = entrada.nextLine();
        System.out.println("Digite o endereco do Administrador: ");
        String endereco = entrada.nextLine();
        System.out.println("Digite o telefone do Administrador: ");
        String telefone = entrada.nextLine();

        System.out.println("Digite o codigo do setor do Administrador: ");
        int codigoSetor = entrada.nextInt();
        System.out.println("Digite o salario base do Administrador: ");
        double salarioBase = entrada.nextDouble();
        System.out.println("Digite o imposto sobre o salario do Administrador: ");
        double imposto = entrada.nextDouble();
        System.out.println("Digite a ajuda de custo do Administrador: ");
        double ajudaDeCusto = entrada.nextDouble();

        System.out.println("---------------------------------------------");
        System.out.println("Criando Administrador");
        System.out.println("---------------------------------------------");
        Administrador administradorTeste = new Administrador(nome,endereco,telefone,codigoSetor, salarioBase,imposto,ajudaDeCusto);
        System.out.println("Administrador criado: ");
        System.out.println(administradorTeste);

        System.out.println("Salario liquido do Administrador (ja com a ajuda de custo): " + administradorTeste.calculaSalario());
    }
}

