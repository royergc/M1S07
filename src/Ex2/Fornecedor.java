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
