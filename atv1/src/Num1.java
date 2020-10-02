import java.util.Scanner;

public class Num1 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Quanto você ganha por hora? : ");
        float salarioHora = entrada.nextFloat();
        System.out.print("Nesse mês quantas horas foram trabalhadas? : ");
        float horas = entrada.nextFloat();

        float salarioBruto = (salarioHora * horas);
        float iprf = (salarioBruto/100) * 11;
        float inss = (salarioBruto/100) * 8;
        float sindicato = (salarioBruto/100) * 5;
        float salarioLiquido = salarioBruto - iprf - sindicato - inss;
        float desconto = salarioBruto - salarioLiquido;

        System.out.println("O seu salario bruto é de: R$ " +  salarioBruto);
        System.out.println("O desconto do IPRF é de: R$ " +  iprf);
        System.out.println("O desconto do INSS é de: R$% " + inss);
        System.out.println("O desconto do sindicato é de: " +  sindicato);
        System.out.println("O seu salário líquido é de: R$ " +  salarioLiquido);
        System.out.println("o valor total descontado é de: " +  desconto);
    }
}

