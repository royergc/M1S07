## Ex 4 - Implemente uma subclasse Administrador
Implemente a classe Administrador como subclasse da classe Empregado. Um determinado administrador tem como atributos, para além dos atributos da classe Pessoa e da classe Empregado, o atributo ajudaDeCusto (ajudas referentes a viagens, estadias, ...). Note que deverá redefinir na classe Administrador o método herdado calcularSalario (o salário de um administrador é equivalente ao salário de um empregado usual acrescido das ajudas de custo). Escreva um programa de teste adequado para esta classe.
### Solução:

Segui exatamente o que o enunciado pedia. ( considerei a mesma logica dos exercicios anteriores, criando mais opções de construtores além da opção padrao).
Para calcular o salario liquido, sobrescrevi o metodo calcularSalario, apenas adicionando a ajudaDeCusto ao salário já calculado da classe Empregado (utilizei o super para aproveitar o código de Empregado).
Para a classe de teste, utilizei a mesma logica dos exercicios anteriores, pedindo ao usuario que preencha os dados via linha de comando para testar a criacao do objeto Administrador e calcular seu salario liquido, já com a ajuda de custo.
O código ficou assim (O código está no meu [GitHub](https://github.com/royergc) , no repositório [M1S07 - src - Ex4](https://github.com/royergc/M1S07/tree/main/src/Ex4)  ).

Classe *Administrador.java:* 

```
package Ex4;

import Ex1.Pessoa;
import Ex3.Empregado;

public class Administrador extends Empregado {

    private double ajudaDeCusto;

    public Administrador(Pessoa pessoa, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(pessoa, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public Administrador(String nome, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calculaSalario() {
        return (super.calculaSalario()) + this.ajudaDeCusto;
    }

    @Override
    public String toString() {
        return "[Administrador]" + " " +
                "Nome: " + getNome() + " " +
                "Endereco: " + getEndereco() + " " +
                "Telefone: " + getTelefone() + " " +
                "codigoSetor : " + getCodigoSetor() + " " +
                "salarioBase: " + getSalarioBase() + " " +
                "imposto :" + getImposto() + " " +
                "ajuda de custo: " + getAjudaDeCusto();
    }
}
```


Classe *AdministradorTester.java*

```
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

```
