package Ex6;

import Ex1.Pessoa;
import Ex3.Empregado;

public class Vendedor extends Empregado {

    private double valorVendas;
    private double comissao;

    public Vendedor(Pessoa pessoa, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(pessoa, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public Vendedor(String nome, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calculaSalario() {
        return super.calculaSalario() + (getValorVendas()*(getComissao()/100));
    }

    @Override
    public String toString() {
        return "[Vendedor]" + " " +
                "Nome: " + getNome() + " " +
                "Endereco: " + getEndereco() + " " +
                "Telefone: " + getTelefone() + " " +
                "codigoSetor : " + getCodigoSetor() + " " +
                "salarioBase: " + getSalarioBase() + " " +
                "imposto :" + getImposto() + " " +
                "valorVendas: " + valorVendas + " " +
                "comissao: " + comissao;
    }
}
