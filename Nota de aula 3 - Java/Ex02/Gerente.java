package Ex02;

public class Gerente extends  Funcionario{

    private String departamento;
    private Double salarioBonus;

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getDepartamento() {
        return departamento;
    }

    public Double getBonus() {
        Double salarioAtual = getSalario();
        Double valorBonus = salarioAtual * 0.1;
        salarioBonus = salarioAtual += valorBonus;
        return salarioBonus;

    }
}