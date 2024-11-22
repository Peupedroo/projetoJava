package model;

import java.util.Date;
import java.util.List;

public class Emprestimo {
    private String id;
    private Date dataRetirada;
    private Date dataEntrega;
    private Usuario usuario;
    private Funcionarios funcionario;
    private List<Exemplar> exemplares;

    public Emprestimo(String id, Date dataRetirada, Date dataEntrega, Usuario usuario, Funcionarios funcionario, List<Exemplar> exemplares) {
        this.id = id;
        this.dataRetirada = dataRetirada;
        this.dataEntrega = dataEntrega;
        this.usuario = usuario;
        this.funcionario = funcionario;
        this.exemplares = exemplares;
    }

    // Getters e setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Funcionarios getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionarios funcionario) {
        this.funcionario = funcionario;
    }

    public List<Exemplar> getExemplares() {
        return exemplares;
    }

    public void setExemplares(List<Exemplar> exemplares) {
        this.exemplares = exemplares;
    }
}
