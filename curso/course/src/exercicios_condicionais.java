import java.util.Scanner;

public class exercicios_condicionais {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    // System.out.println("Digite o preço do produto");
    // double valor = scanner.nextDouble();

    // if(valor <= 50){
    //   System.out.println("Barato");
    // } else if( valor <= 100){
    //   System.out.println("Médio");
    // }else{
    //   System.out.println("caro");
    // }

    System.out.println("Digite o seu nome de usuário");

    String nomeLogin = scanner.nextLine();
    
    System.out.println("Digite a sua senha");
      String senha = scanner.nextLine();

    if (nomeLogin.equals("admin") && senha.equals("1234")){
      System.out.println("Acesso liberado");
    } else{
      System.out.println("Acesso negado");
    }

    scanner.close();


  }
}
