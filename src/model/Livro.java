package model;

public class Livro {
    private int ISBN, nPaginas, nEdicao, exemplares;
    private String autor, editora,  titulo;

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    public void setnEdicao(int nEdicao) {
        this.nEdicao = nEdicao;
    }

    public void setExemplares(int exemplares) {
        this.exemplares = exemplares;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setTitulo(String titulo) {this.titulo = titulo;}


    public int getISBN() {
        return ISBN;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public int getnEdicao() {
        return nEdicao;
    }

    public int getExemplares() {
        return exemplares;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public String getTitulo() {return  titulo;}




    @Override
    public String toString() {
        return "Livro{" +
                "ISBN=" + ISBN +
                ", nPaginas=" + nPaginas +
                ", nEdicao=" + nEdicao +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", exemplares='" + exemplares + '\'' +
                '}';
    }
}
