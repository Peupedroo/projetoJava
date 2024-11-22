package model;

public class Editora {

    private String CNPJ, nomeFantasia;

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCNPJ() {
        return CNPJ;
    }
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    @Override
    public String toString() {
        return "Editora{" +
                "CNPJ='" + CNPJ + '\'' +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                '}';
    }
}
