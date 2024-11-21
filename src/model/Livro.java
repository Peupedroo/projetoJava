package model;

public class Livro {
    private int ISBN, nPaginas, nEdicao;
    private String autor, editora, exemplares;


    public int getISBN() {
        return ISBN;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public int getnEdicao() {
        return nEdicao;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public String getExemplares() {
        return exemplares;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    public void setnEdicao(int nEdicao) {
        this.nEdicao = nEdicao;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setExemplares(String exemplares) {
        this.exemplares = exemplares;
    }
}
