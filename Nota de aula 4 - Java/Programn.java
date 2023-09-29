import java.util.Scanner;

public class Programn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Infome a marca do carro: ");
        String marca = sc.nextLine();

        System.out.println("Informe o modelo: ");
        String modelo = sc.nextLine();

        Carro carro = new Carro(marca, modelo);
        String detalhes = carro.mostrarDetalhes();
        System.out.println(detalhes);
    }
}