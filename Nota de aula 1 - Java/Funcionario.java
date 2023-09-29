public class Funcionario {

    private String matricula;
    private String nome;
    private double salario;
    private double deducao;
    private double salarioLiquido;

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
    public double getDeducao() {
        deducao = salario * 0.15;
        return deducao;
    }
    public double getSalarioLiquido() {
        salarioLiquido = salario - deducao;
        return salarioLiquido;
    }
}