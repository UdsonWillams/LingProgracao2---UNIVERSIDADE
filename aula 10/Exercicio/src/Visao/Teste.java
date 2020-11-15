package Visao;

import Modelo.Livro;
import Modelo.Revista;

public class Teste {

    public static void main(String[] args) {

        Livro biblia = new Livro("Biblia Sagrada", "11/07/2000", "Saraiva", "123654");
        Revista veja = new Revista("O grande Ataque", "19/06/2000", "Saraiva", "Mensal");

        System.out.println(biblia);
        System.out.println(veja);
    }
}
