package Modelo;

public class AlunoUniesp extends Aluno{ //Extends pai

    private String matricula;
    private String endereco;

    public AlunoUniesp(String nome, Turma turma, char sexo, String matricula, String endereco) {
        super(nome, turma, sexo);
        this.matricula = matricula;
        this.endereco = endereco;
    }
    public AlunoUniesp(String nome, char sexo, String matricula, String endereco) {
        super(nome, null, sexo);
        this.matricula = matricula;
        this.endereco = endereco;
    }
    public AlunoUniesp() {}

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public String toString() {
        return "AlunoUniesp [matricula=" + this.matricula + ", endereco=" + this.endereco
                + ", Nome=" + getNome() + ", Turma=" + getTurma() + ", Sexo=" + getSexo() + "]";
    }

}
