package Visao;

import Modelo.AlunoIntercambio;
import Modelo.AlunoUniesp;
import Modelo.Turma;

public class Teste {

    public static void main(String[] args) {

        Turma poo = new Turma(1, "Java - POO");
        AlunoIntercambio bryan = new AlunoIntercambio("Bryan Smith", 'm', "3234fDF", "NYC University");
        AlunoUniesp paulo = new AlunoUniesp("Paulo Junior", 'm', "2019488", "Cabedelo");

        System.out.println(bryan);
        System.out.println(paulo);


    }
}
