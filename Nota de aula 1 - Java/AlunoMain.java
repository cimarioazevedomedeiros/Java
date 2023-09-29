import java.util.Scanner;

public class AlunoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("====================================");
        System.out.println("          Escola De Sábios          ");
        System.out.println("====================================");

        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.next();

        System.out.println("Digite a 1º nota do aluno: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a 2º nota do aluno: ");
        double nota2 = scanner.nextDouble();

        aluno.setNome(nome);
        aluno.setNota1(nota1);
        aluno.setNota2(nota2);

        System.out.println("====================================");

        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("1º nota: " + aluno.getNota1());
        System.out.println("2º nota: " + aluno.getNota2());
        System.out.println("Média: " + aluno.getMedia());
        System.out.println("Situação: " + aluno.getSituacao());

        System.out.println("====================================");
    }
}