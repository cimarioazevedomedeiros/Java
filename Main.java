import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculador c = new Calculador();
        Scanner sc = new Scanner(System.in);

        int n1, n2;

        System.out.println("Escolha uma das operações: 0 - Soma / 1 - Sub / 2 - Mult / 3 - Div");
        int x = sc.nextInt();
            switch (x) {
                case 0:
                    System.out.println("Soma");
                    break;
                case 1:
                    System.out.println("Subtração");
                    break;
                case 2:
                    System.out.println("Multiplicação");
                    break;
                case 3 :
                    System.out.println("Divisão");
                    break;
                default:
                    System.out.println("Opção inválida");
                    sc.close();
                    return;
            }

            System.out.println("Digite o primeiro número: ");
            n1 = sc.nextInt();
            System.out.println("Digite o segundo número: ");
            n2 = sc.nextInt();

            switch (x) {
                case 0:
                    System.out.println("Resultado: " + c.somar(n1, n2));
                    break;
                case 1:
                    System.out.println("Resultado: " + c.subtrair(n1, n2));
                    break;
                case 2:
                    System.out.println("Resultado: " + c.multiplicar(n1, n2));
                    break;
                case 3:
                    System.out.println("Resultado: " + c.dividir(n1, n2));
                    break;
            }

            sc.close();
    }
}
