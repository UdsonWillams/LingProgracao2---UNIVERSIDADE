public class Conta {

    private int numero;
    private double saldo;

    public Conta() {}

    public Conta(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    //get e set numero
    public int getNumero(){
        return numero;
    }
    public void setNumero(){
        this.numero = numero;
    }
    //get e set saldo
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(){
        this.saldo = saldo;
    }

    //toString
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
