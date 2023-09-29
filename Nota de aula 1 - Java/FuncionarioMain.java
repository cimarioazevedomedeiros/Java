import java.util.Scanner;
public class FuncionariosMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("====================================");
        System.out.println("          Quadro Funcional          ");
        System.out.println("====================================");

        System.out.println("Informe a matrícula do funcionário: ");
        String matricula = scanner.next();

        System.out.println("Informe o nome do funcionário: ");
        String nome = scanner.next();

        System.out.println("Informe o salário do funcionário: ");
        double salario = scanner.nextDouble();

        funcionario.setMatricula(matricula);
        funcionario.setNome(nome);
        funcionario.setSalario(salario);
        System.out.println("====================================");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Matrícula: " + funcionario.getMatricula());
        System.out.printf("Salário Bruto: R$ %.2f%n", funcionario.getSalario());
        System.out.printf("Dedução INSS: R$ %.2f%n", funcionario.getDeducao());
        System.out.printf("Salário Líquido: R$ %.2f%n", funcionario.getSalarioLiquido());
        System.out.println("====================================");
    }
}
