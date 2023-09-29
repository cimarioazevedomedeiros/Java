package Ex02;

import java.util.Scanner;
public class FuncionariosMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("          Cadastro de Laboral            ");
        System.out.println("=========================================");

        System.out.println("      Selecione a opção de cadastro      ");
        System.out.println("[1] Gerente\n[2] Diretor");
        System.out.println("-----------------------------------------");

        int opcao = scanner.nextInt();

        System.out.println("-----------------------------------------");

        switch (opcao) {
            case 1:
                Gerente funcionarioGerente = new Gerente();

                System.out.println("Informe o nome: ");
                String nome = scanner2.nextLine();
                System.out.println("Informe o salário: ");
                Double salario = scanner.nextDouble();
                System.out.println("Informe o departamento: ");
                String departamento = scanner2.nextLine();

                funcionarioGerente.setNome(nome);
                funcionarioGerente.setSalario(salario);
                funcionarioGerente.setDepartamento(departamento);


                System.out.println("=========================================");
                System.out.println("     Gerente cadastrada com sucesso      ");
                System.out.println("=========================================");
                System.out.println("Nome: " + funcionarioGerente.getNome());
                System.out.println("Departamento: " + funcionarioGerente.getDepartamento());
                System.out.printf("Salário: R$ %.2f%n", funcionarioGerente.getSalario());
                System.out.printf("Salário com Bônus: R$ %.2f%n", funcionarioGerente.getBonus());
                System.out.println("=========================================");

                break;
            case 2:
                Diretor funcionarioDiretor = new Diretor();

                System.out.println("Informe o nome: ");
                nome = scanner2.nextLine();
                System.out.println("Informe o salário: ");
                salario = scanner.nextDouble();
                System.out.println("Informe a quantidade de ações: ");
                int acoes = scanner2.nextInt();

                funcionarioDiretor.setNome(nome);
                funcionarioDiretor.setSalario(salario);
                funcionarioDiretor.setAcoes(acoes);

                System.out.println("=========================================");
                System.out.println("     Diretor cadastrado com sucesso      ");
                System.out.println("=========================================");
                System.out.println("Nome: " + funcionarioDiretor.getNome());
                System.out.printf("Salário: R$ %.2f%n", funcionarioDiretor.getSalario());
                System.out.println("Nº de ações: " + funcionarioDiretor.getAcoes());
                System.out.println("=========================================");

                break;

            default:
                System.out.println("Opção inválida");
                System.out.println("=========================================");

                break;
        }
    }
}