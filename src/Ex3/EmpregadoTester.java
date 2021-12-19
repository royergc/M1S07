package Ex3;

import java.util.Scanner;

public class EmpregadoTester {

        public static void main(String[] args) {
            System.out.println("---------------------------------------------");
            System.out.println("Testando implementacao da classe Empregado");
            System.out.println("---------------------------------------------");

            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite o nome do Empregado: ");
            String nome = entrada.nextLine();
            System.out.println("Digite o endereco do Empregado: ");
            String endereco = entrada.nextLine();
            System.out.println("Digite o telefone do Empregado: ");
            String telefone = entrada.nextLine();

            System.out.println("Digite o codigo do setor do Empregado: ");
            int codigoSetor = entrada.nextInt();
            System.out.println("Digite o salario base do Empregado: ");
            double salarioBase = entrada.nextDouble();
            System.out.println("Digite o imposto sobre o salario do Empregado: ");
            double imposto = entrada.nextDouble();

            System.out.println("---------------------------------------------");
            System.out.println("Criando Empregado");
            System.out.println("---------------------------------------------");
            Empregado empregadoTeste = new Empregado(nome,endereco,telefone,codigoSetor, salarioBase,imposto);
            System.out.println("Empregado criado: ");
            System.out.println(empregadoTeste);

            System.out.println("Salario liquido do Empregado: " + empregadoTeste.calculaSalario());
        }
 }

