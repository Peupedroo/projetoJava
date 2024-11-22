package model;

public abstract class Pessoa {
    private String id;
    private String nome;
    private String endereco;
    private String telefones;

    public Pessoa(String id, String nome, String endereco, String telefones) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefones = telefones;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefones() {
        return telefones;
    }

    public void setTelefones(String telefones) {
        this.telefones = telefones;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefones='" + telefones + '\'' +
                '}';
    }
}