package Modelo;

public class Livro extends Publicacao{ //extends classe Pai

    private String isbn;

    public Livro(String nome, String dataPublicacao, String editora, String isbn) {
        super(nome, dataPublicacao, editora);
        this.isbn = isbn;
    }

    public Livro() {}

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public String toString() {
        return "Livro {" + "Nome do Livro: " + getNome() + ", Data de Publicação: " + getDataPublicacao()
                + ", Editora: " + getEditora() +
                ", isbn: " + isbn + "} ";
    }
}

