## Ex 3 - Implemente uma subclasse Empregado
Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada instância da classe Empregado tem, para além dos atributos que caracterizam a classe Pessoa, os atributos codigoSetor (inteiro), salarioBase (vencimento base) e imposto (porcentagem retida dos impostos). Implemente a classe Empregado com métodos seletores e modificadores e um método calcularSalario. Escreva um programa de teste adequado para a classe Empregado.

### Solução:

Segui exatamente o que o enunciado pedia. ( considerei a mesma logica dos exercicios anteriores, criando mais opções de construtores além da opção padrao).
Para calculo do salario, considerei que o imposto é um valor percentual a ser descontado do salario (imposto de 27,5% por exemplo).
Para a classe de teste, utilizei a mesma logica do Ex2, pedindo ao usuario que preencha os dados via linha de comando para testar a criacao do objeto Empregado e calcular seu salario liquido.
O código ficou assim (O código está no meu [GitHub](https://github.com/royergc) , no repositório [M1S07 - src - Ex3](https://github.com/royergc/M1S07/tree/main/src/Ex3)  ).

Classe *Empregado.java:* 

```
package Ex3;

import Ex1.Pessoa;

public class Empregado extends Pessoa {

    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public Empregado(Pessoa pessoa, int codigoSetor, double salarioBase, double imposto) {
        super(pessoa.getNome(), pessoa.getEndereco(), pessoa.getTelefone());
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public Empregado(String nome, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double calculaSalario() {
        return this.salarioBase - (this.salarioBase * (this.imposto/100));
    }

    @Override
    public String toString() {
        return "[Empregado]" + " " +
                "Nome: " + getNome() + " " +
                "Endereco: " + getEndereco() + " " +
                "Telefone: " + getTelefone() + " " +
                "codigoSetor : " + codigoSetor + " " +
                "salarioBase: " + salarioBase + " " +
                "imposto :" + imposto;
    }
}
```


Classe *EmpregadoTester.java*

```
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

```
