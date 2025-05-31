import java.util.Scanner;

public class exercicioProdutos {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String produto1 = "arame";
    String produto2 = "alicate";
    String produto3 = "pá";

    System.out.println("Digite o produto que deseja pesquisar");

    String produtoCliente = scanner.nextLine().toLowerCase();

    switch (produtoCliente) {
      case "arame":
        System.out.println("O seu produto é " + produto1 + " no valor de R$ 25 reais.");
        break;

        case "alicate":
        System.out.println("O seu produto é " + produto2 + "  no valor de R$59 reais.");
        break;

        case "pá":
        System.out.println("O seu produto é " + produto3 + " no valor de R$ 135 reais.");
        break;

      default:
        System.out.println("Nenhum item encontrado");
        break;
    }

    System.out.println("Deseja alterar o valor do produto? 1 :  sim  2 : não ");

    int validacaoProduto = scanner.nextInt();

    if(validacaoProduto == 1){
      System.out.println("Insira o valor que deseja alterar ao produto");
      double valorProduto = scanner.nextDouble();
      if (valorProduto < 50) {
          System.out.println("Seu produto foi atribuido ao valor de " + valorProduto + " e está classificado como barato");
      } else if (valorProduto < 100) {
        System.out.println("Seu produto foi atribuido ao valor de " + valorProduto + " e está classificado como médio");
      } else{
        System.out.println("Seu produto foi atribuido ao valor de " + valorProduto + " e está classificado como caro");
      }
      // System.out.println("Seu produto é arame e ficou no preço de " + valorProduto + " reais");
    }else{
      System.out.println("Você não alterou o produto");
    }



    scanner.close();
  }
}