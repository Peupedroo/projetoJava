package model;

public class Funcionarios extends Pessoa {

    public Funcionarios(String id, String nome, String endereco, String telefones) {
        super(id, nome, endereco, telefones);
    }

    double salario ;
    String dadosCarteira;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDadosCarteira() {
        return dadosCarteira;
    }

    public void setDadosCarteira(String dadosCarteira) {
        this.dadosCarteira = dadosCarteira;
    }

    @Override
    public String toString() {
        return "Funcionarios{" +
                "salario=" + salario +
                ", dadosCarteira='" + dadosCarteira + '\'' +
                '}';
    }
}
