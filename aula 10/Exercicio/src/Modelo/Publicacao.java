package Modelo;

public class Publicacao {

    private String nome;
    private String dataPublicacao;
    private String editora;

    public Publicacao(String nome, String dataPublicacao, String editora) {
        this.nome = nome;
        this.dataPublicacao = dataPublicacao;
        this.editora = editora;
    }

    public Publicacao() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }


    public String toString() {
        return "Publicacao{" +
                "nome='" + nome + '\'' +
                ", dataPublicacao='" + dataPublicacao + '\'' +
                ", editora='" + editora + '\'' +
                '}';
    }
}
