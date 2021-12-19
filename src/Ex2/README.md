## Ex 2 - Implemente uma subclasse Fornecedor
Considere, como subclasse da classe Pessoa (desenvolvida no exercício anterior) a classe Fornecedor. Considere que cada instância da classe Fornecedor tem, para além dos atributos que caracterizam a classe Pessoa, os atributos valorCredito (correspondente ao crédito máximo atribuído ao fornecedor) e valorDivida (montante da dívida para com o fornecedor). Implemente na classe Fornecedor, para além dos usuais métodos seletores e modificadores, um método obterSaldo() que devolve a diferença entre os valores dos atributos valorCredito e valorDivida. Depois de implementada a classe Fornecedor, crie um programa de teste adequado que lhe permita verificar o funcionamento dos métodos implementados na classe Fornecedor e os herdados da classe Pessoa.
 

### Solução:
Implementei a classe Fornecedor extendendo a classe Pessoa do Ex1, como pedido no enunciado.
Adicionei os atributos privados de Fornecedor e criei os métodos conforme o enunciado pedia.
Além disso reescrevi a funcao toString de Fornecedor para poder imprimir seus detalhes, durante os testes com ela.
O código ficou assim:

```
package Ex2;

import Ex1.Pessoa;

public class Fornecedor extends Pessoa {

    private double valorCredito;
    private double valorDivida;

    public Fornecedor(Pessoa pessoa, double valorCredito, double valorDivida) {
        super(pessoa.getNome(),pessoa.getEndereco(),pessoa.getTelefone());
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double obterSaldo() {
        return valorCredito - valorDivida;
    }

    @Override
    public String toString() {
        return "[Fornecedor] =  " +
                "Nome: " + getNome() + " " +
                "Endereco: " + getEndereco() + " " +
                "Telefone: " + getTelefone() + " " +
                "ValorCredito: " + getValorCredito() + " " +
                "ValorDivida :" + getValorDivida();
    }
}
```

Depois disso, criei a classe FornecedorTeste que testa a criacao de um objeto fornecedor, 
imprimindo seus atributos (utilizando seus metodos herdados da classe Pessoa e os metodos criados para seus obter atributos adicionados) e por fim obtendo o saldo atraves do metodo obterSaldo.
Essa classe le os dados que o usuario precisa inserir para criar o Fornecedor. O codigo ficou assim: 

```
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

```
