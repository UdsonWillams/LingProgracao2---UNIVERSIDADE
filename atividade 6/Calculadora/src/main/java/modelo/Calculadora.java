package modelo;
/**
 * @author UdsonWillams
 */
public class Calculadora {
    
    private int num1;
    private int num2;
    private int soma;
    private int sub;
    private int div;
    private int mult;

    public Calculadora(int num1, int num2, int soma, int sub, int div, int mult) {
        this.num1 = num1;
        this.num2 = num2;
        this.soma = soma;
        this.sub = sub;
        this.div = div;
        this.mult = mult;
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

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }

    public int getSub() {
        return sub;
    }

    public void setSub(int sub) {
        this.sub = sub;
    }

    public int getDiv() {
        return div;
    }

    public void setDiv(int div) {
        this.div = div;
    }

    public int getMult() {
        return mult;
    }

    public void setMult(int mult) {
        this.mult = mult;
    }

    
    public String toString() {
        return "Calculadora{" + "num1=" + num1 + ", num2=" + num2 + ", soma=" + soma + ", sub=" + sub + ", div=" + div + ", mult=" + mult + '}';
    } 
}
