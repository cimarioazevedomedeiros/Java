import java.util.Scanner;
public class SuperCalculadoraMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("             Calculadora              ");
        System.out.println("--------------------------------------");
        boolean res = true;
        int contador = 0;

        do {

            System.out.println("O que você deseja fazer?");
            System.out.println("--------------------------------------");
            System.out.println("[1] Somar\n[2] Subtrair\n[3] Multiplicar\n[4] Dividir\n[0] Parar");
            System.out.println("--------------------------------------");

            int opcao = scanner.nextInt();
            System.out.println("--------------------------------------");

            if (opcao == 0) {
                if (contador == 1) {
                    System.out.println("Você fez apenas " + contador + " operação.");
                    res = false;
                    break;
                } else {
                    System.out.println("Você fez um total de " + contador + " operações.");
                    res = false;
                    break;
                }

            }

            if (opcao >= 1 && opcao <= 4) {
                System.out.println("Digite o valor 1: ");
                int valor1 = scanner.nextInt();

                System.out.println("Digite o valor 2: ");
                int valor2 = scanner.nextInt();
                System.out.println("======================================");

                SuperCalculadora calc = new SuperCalculadora(valor1, valor2);

                switch (opcao) {

                    case 1:
                        System.out.println("A soma dos valores é igual a " + calc.somar());
                        System.out.println("======================================");
                        contador++;
                        break;
                    case 2:
                        System.out.println("O minuendo dos valores é igual a " + calc.subtrair());
                        System.out.println("======================================");
                        contador++;
                        break;
                    case 3:
                        System.out.println("O produto dos valores é igual a " + calc.multiplicar());
                        System.out.println("======================================");
                        contador++;
                        break;
                    case 4:
                        System.out.println("O quociente dos valores é igual a " + calc.dividir());
                        System.out.println("======================================");
                        contador++;
                        break;

                }
            } else {
                System.out.println("Opção inválida");
                System.out.println("--------------------------------------");
            }
        } while (res);
    }
}