package modelo;

public class Funcionario {
    private int idFunci;
    private int idSetor;
    private int salario;
    private int rgFunci;
    private boolean funciAtivo;

    public Funcionario(){}

    public Funcionario(int i, int idS, int salar, int rg, boolean funciAtv){
        this.idFunci = i;
        this.idSetor = idS;
        this.salario = salar;
        this.rgFunci = rg;
        this.funciAtivo = funciAtv;
    }

    public int getIdFunci() {
        return idFunci;
    }

    public void setIdFunci() {
        this.idFunci = idFunci;
    }

    public int getIdSetor() {
        return idSetor;
    }

    public void setIdSetor() {
        this.idSetor = idSetor;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario() {
        this.salario = salario;
    }

    public int getRgFunci() {
        return rgFunci;
    }

    public void setRgFunci() {
        this.rgFunci = rgFunci;
    }

    public boolean getfunciAtivo() {
        return funciAtivo;
    }

    public void setfunciAtivo() {
        this.funciAtivo = funciAtivo;
    }

    public void bonificar(float aumento){
        this.salario += aumento;
    }

    public void demite(){
        this.funciAtivo = false;
    }

}
