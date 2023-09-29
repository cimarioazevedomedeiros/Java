package Ex02;

public class Funcionario {

    protected String nome;
    protected Double salario;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public Double getSalario() {
        return salario;
    }
}