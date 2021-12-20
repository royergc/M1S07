## Ex 5 - Implemente uma subclasse Operario 
Implemente a classe Operario como subclasse da classe Empregado. Um determinado operário tem como atributos, para além dos atributos da classe Pessoa e da classe Empregado, o atributo valorProducao (que corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário) e comissao (que corresponde à porcentagem do valorProducao que será adicionado ao vencimento base do operário). Note que deverá redefinir nesta subclasse o método herdado calcularSalario (o salário de um operário é equivalente ao salário de um empregado usual acrescido da referida comissão). Escreva um programa de teste adequado para esta classe.

### Solução:

Segui exatamente o que o enunciado pedia. ( considerei a mesma logica dos exercicios anteriores, criando mais opções de construtores além da opção padrao).
Para calcular o salario liquido, sobrescrevi o metodo calcularSalario, apenas adicionando a comissao (uma multiplicacao do valorProducao * (comissao / 100) ) ao salário já calculado da classe Empregado (utilizei o super para aproveitar o código de Empregado).
Para a classe de teste, utilizei a mesma logica dos exercicios anteriores, pedindo ao usuario que preencha os dados via linha de comando para testar a criacao do objeto Operario e calcular seu salario liquido, já com a comissao inclusa.
O código ficou assim (O código está no meu [GitHub](https://github.com/royergc) , no repositório [M1S07 - src - Ex5](https://github.com/royergc/M1S07/tree/main/src/Ex5)  ).

Classe *Operario.java:* 

```
package Ex5;

import Ex1.Pessoa;
import Ex3.Empregado;

public class Operario extends Empregado {

    private double valorProducao;
    private double comissao;

    public Operario(Pessoa pessoa, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(pessoa, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public Operario(String nome, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calculaSalario() {
        return super.calculaSalario() + (getValorProducao()*(getComissao()/100));
    }

    @Override
    public String toString() {
        return "[Operario]" + " " +
                "Nome: " + getNome() + " " +
                "Endereco: " + getEndereco() + " " +
                "Telefone: " + getTelefone() + " " +
                "codigoSetor : " + getCodigoSetor() + " " +
                "salarioBase: " + getSalarioBase() + " " +
                "imposto :" + getImposto() + " " +
                "valorProducao=" + valorProducao + " " +
                "comissao=" + comissao;
    }
}
```


Classe *OperarioTester.java*

```
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

```
