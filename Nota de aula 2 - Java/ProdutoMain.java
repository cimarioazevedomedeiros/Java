import java.util.Scanner;
public class ProdutosMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("       Cadastro de produtos       ");
        System.out.println("==================================");

        Produto produto = new Produto();

        System.out.println("Informe o código do produto: ");
        String codigo = scanner.next();

        System.out.println("Informe o nome do produto: ");
        String nome = scanner.next();

        System.out.println("Informe a quantidade do produto: ");
        int qtd = scanner.nextInt();

        produto.setCodigo(codigo);
        produto.setNome(nome);
        produto.setQtd(qtd);

        System.out.println("Produtos cadastrado com sucesso");
        System.out.println("==================================");
        System.out.println("Código de produto: " + produto.getCodigo());
        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Unidades: " + produto.getQtd());
        System.out.println("==================================");

        System.out.println("Você deseja realizar vendas ?");
        System.out.println("[0] Não \n[1] Sim");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 0:
                System.out.println("==================================");
                System.out.println("Encerrando o programa");
                break;
            case 1:
                System.out.println("==================================");
                System.out.println("Quantas unidades serão vendidas? ");
                int qtdVendas = scanner.nextInt();
                System.out.println("==================================");
                produto.setQtdVendas(qtdVendas);
                System.out.println("Foram vendidas " + produto.getQtdVendas() + " unidades de " + produto.getNome());
                System.out.println("Quantidade final em estoque: " + produto.getQtdFinal());
                System.out.println("==================================");
                break;
            default:
                System.out.println("==================================");
                System.out.println("Opção de inválida!");
                break;
        }

    }
}
