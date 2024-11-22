package model;

public class Autor extends Pessoa{

    public Autor(String id, String nome, String endereco, String telefones) {
        super(id, nome, endereco, telefones);
    }

    private int codigo ;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "codigo=" + codigo +
                '}';
    }
}
