package model;

public interface Emprestavel {
    void registrarEmprestimo(Usuario usuario, Funcionarios funcionario);
    void devolverItem(Usuario usuario, Funcionarios funcionario);
}
