import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int i;
        int numero, contasACadastrar, numeroMaior = 0;
        double saldo, maior, saldoMaior = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a quantidade de contas a cadastrar?");
        contasACadastrar = sc.nextInt();

        Conta[] listaDeContas = new Conta[contasACadastrar];

        for (i = 0; i < contasACadastrar; i++){
            System.out.println("Por favor, Diga o numero da conta ");
            numero = sc.nextInt();
            System.out.println("Por favor, Diga o saldo dessa conta");
            saldo = sc.nextDouble();
            listaDeContas[i] = new Conta(numero, saldo);
        }
        //For Que mostra o numero e o saldo de todas as contas.
        /*for (i = 0; i < contasACadastrar; i++){
            System.out.println("Numero da conta: " + listaDeContas[i].getNumero());
            System.out.println("Saldo: " + listaDeContas[i].getSaldo());
            System.out.println("----------------------------------------------------");
        }*/
        for (i = 0; i < contasACadastrar; i++){
            maior = listaDeContas[i].getSaldo();
            if (maior > saldoMaior){
                numeroMaior = listaDeContas[i].getNumero();
                saldoMaior = listaDeContas[i].getSaldo();
            }
            maior = 0;
        }
        System.out.println("A CONTA COM O MAIOR SALDO É A DE NUMERO: " + numeroMaior);
        System.out.println("COM SALDO DE R$" + saldoMaior);
    }
}
