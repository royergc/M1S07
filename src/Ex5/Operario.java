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
