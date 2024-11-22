package model;

public class Exemplar implements Emprestavel {
    private int numeracao;
    private Livro livro;

    public Exemplar(int numeracao, Livro livro) {
        this.numeracao = numeracao;
        this.livro = livro;
    }

    public int getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(int numeracao) {
        this.numeracao = numeracao;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    @Override
    public void registrarEmprestimo(Usuario usuario, Funcionarios funcionario) {
        System.out.println("Empréstimo registrado para o usuário: " + usuario.getNome() + " pelo funcionário: " + funcionario.getNome());

    }

    @Override
    public void devolverItem(Usuario usuario, Funcionarios funcionario) {
        System.out.println("Item devolvido pelo usuário: " + usuario.getNome() + " registrado pelo funcionário: " + funcionario.getNome());

    }

    @Override
    public String toString() {
        return "Exemplar{" +
                "numeracao=" + numeracao +
                ", livro=" + livro.getTitulo() +
                '}';
    }
}
