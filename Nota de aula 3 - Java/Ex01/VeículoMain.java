package Ex01;

import java.util.Scanner;
public class VeiculoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("            Cadastro Veiculos            ");
        System.out.println("=========================================");

        System.out.println("                 Opções                  ");
        System.out.println("[1] Motocicleta\n[2] Carro");
        System.out.println("-----------------------------------------");

        int opcao = scanner.nextInt();
        System.out.println("-----------------------------------------");

        switch (opcao) {
            case 1:
                Moto veiculoMoto = new Moto();

                System.out.println("Informe a marca: ");
                String marca = scanner2.nextLine();
                System.out.println("Informe o modelo: ");
                String modelo = scanner2.nextLine();
                System.out.println("Informe o ano de fabricação : ");
                int anoFabricacao = scanner.nextInt();
                System.out.println("Informe as cilindradas : ");
                int cilindradas = scanner.nextInt();

                veiculoMoto.setMarca(marca);
                veiculoMoto.setModelo(modelo);
                veiculoMoto.setAnoFabricacao(anoFabricacao);
                veiculoMoto.setCilindradas(cilindradas);

                System.out.println("=========================================");
                System.out.println("       Moto cadastrada com sucesso       ");
                System.out.println("=========================================");
                System.out.println("Marca: " + veiculoMoto.getMarca());
                System.out.println("Modelo: " + veiculoMoto.getModelo());
                System.out.println("Ano de Fabricação: " + veiculoMoto.getAnoFabricacao());
                System.out.println("Cilindradas: " + veiculoMoto.getCilindradas() + " cm³");
                System.out.println("=========================================");

                break;

            case 2:
                Carro veiculoCarro = new Carro();

                System.out.println("Informe a marca: ");
                marca = scanner2.nextLine();
                System.out.println("Informe o modelo: ");
                modelo = scanner2.nextLine();
                System.out.println("Informe o ano de fabricação : ");
                anoFabricacao = scanner.nextInt();
                System.out.println("Informe o nº de portas: ");
                int portas = scanner.nextInt();

                veiculoCarro.setMarca(marca);
                veiculoCarro.setModelo(modelo);
                veiculoCarro.setAnoFabricacao(anoFabricacao);
                veiculoCarro.setPortas(portas);

                System.out.println("=========================================");
                System.out.println("       Carro cadastrado com sucesso      ");
                System.out.println("=========================================");
                System.out.println("Marca: " + veiculoCarro.getMarca());
                System.out.println("Modelo: " + veiculoCarro.getModelo());
                System.out.println("Ano de Fabricação: " + veiculoCarro.getAnoFabricacao());
                System.out.println("Quantidade de portas: " + veiculoCarro.getPortas());
                System.out.println("=========================================");

                break;

            default:
                System.out.println("Opção inválida");
                System.out.println("=========================================");

                break;
        }
    }
}