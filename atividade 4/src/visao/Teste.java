package visao;

import modelo.Funcionario;

public class Teste {

    public static void main(String[] args) {
        int i;

        Funcionario[] listaFuncionarios = new Funcionario[5];

        Funcionario funcionario1 = new Funcionario(1, 1, 1000, 1111111, true);
        listaFuncionarios[0] = funcionario1;
        listaFuncionarios[1] = new Funcionario(2, 1, 1000, 2222222, true);
        listaFuncionarios[2] = new Funcionario(3, 2, 2000, 3333333, true);
        listaFuncionarios[3] = new Funcionario(4, 1, 1000, 4444444, false);
        listaFuncionarios[4] = new Funcionario(5, 2, 2000, 5555555, false);
        for (i = 0; i < 5; i++) {
            System.out.println("Id: " + listaFuncionarios[i].getIdFunci());
            System.out.println("Id do Setor" + listaFuncionarios[i].getIdSetor());
            System.out.println("Salario: " + listaFuncionarios[i].getSalario());
            System.out.println("RG do Funcionario: " + listaFuncionarios[i].getRgFunci());
            if (listaFuncionarios[i].getfunciAtivo() == true) {
                System.out.println("FUNCIONARIO ATIVO");
                listaFuncionarios[i].bonificar(1000);
            }
            else {
                System.out.println("FUNCIONARIO DEMITIDO");
            }
            System.out.println(listaFuncionarios[i].getfunciAtivo());
            System.out.println("------------------------------------------------------------");
        }
        for (i = 0; i < 5; i++) {
            System.out.println(listaFuncionarios[i].getSalario());
        }
    }
}
