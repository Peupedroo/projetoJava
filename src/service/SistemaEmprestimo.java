package service;

import model.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SistemaEmprestimo implements Emprestavel {
    private List<Emprestimo> emprestimos = new ArrayList<>();

    @Override
    public void registrarEmprestimo(Usuario usuario, Funcionarios funcionario) {
        // Implementação da lógica de negócios para registrar um empréstimo
    }

    @Override
    public void devolverItem(Usuario usuario, Funcionarios funcionario) {
        // Implementação da lógica de negócios para devolver um item
    }

    public void registrarEmprestimo(String id, Date dataRetirada, Usuario usuario, Funcionarios funcionario, List<Exemplar> exemplares) {
        Emprestimo emprestimo = new Emprestimo(id, dataRetirada, null, usuario, funcionario, exemplares);
        emprestimos.add(emprestimo);
    }

    public void devolverEmprestimo(Emprestimo emprestimo) {
        emprestimo.setDataEntrega(new Date()); // Atualiza a data de entrega para a data atual
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
}
