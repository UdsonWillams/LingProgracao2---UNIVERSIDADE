package Modelo;

public class Isbn extends Publicacao{ //extends classe Pai

    private String isbn;

    public Isbn(String isbn) {
        this.isbn = isbn;
    }

    public Isbn() {
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public String toString() {
        return "Isbn{" +
                "isbn='" + isbn + '\'' +
                '}';
    }
}
