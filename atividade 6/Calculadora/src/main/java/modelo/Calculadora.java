package modelo;

import javax.swing.JTextField;

/**
 * @author UdsonWillams
 */
public class Calculadora {
    
    private int num1;
    private int num2;
    
    public Calculadora(){}
    
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int soma(int num1, int num2){
        int resultado = num1 + num2;
        return resultado;
    }
    
    public int sub(int num1, int num2){
        int resultado = num1 - num2;
        return resultado;
    }
    
    public int div(int num1, int num2){
        int resultado = num1 / num2;
        return resultado;
    }
    
    public int mult(int num1, int num2){
        int resultado = num1 * num2;
        return resultado;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "Calculadora{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }    
}
