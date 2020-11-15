package Modelo;

public class Revista extends Publicacao{ //extends classe pai

    private String periodicidade;

    public Revista(String nome, String dataPublicacao, String editora, String periodicidade) {
        super(nome, dataPublicacao, editora);
        this.periodicidade = periodicidade;
    }

    public Revista() {}

    public String getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }


    public String toString() {
        return "Revista {" +"Nome da Revista: " + getNome() + ", Data de Publicação: " + getDataPublicacao()
                + ", Editora: " + getEditora() +
                "periodicidade: " + periodicidade + " }";
    }
}
