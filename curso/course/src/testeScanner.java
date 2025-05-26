
import java.util.Scanner;
public class testeScanner {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o seu nome:");
    String nome = scanner.nextLine();
    System.out.println("Qual é a sua idade?");
    int idade = scanner.nextInt();

    scanner.nextLine();

    System.out.println("Digite o Seu endereço: ");
    String txt = scanner.nextLine();



    System.out.println("Digite o Número da sua casa");
    int n = scanner.nextInt();

    System.out.println("Olá, " + nome + " sua idade é : " + idade + " anos, e seu endereço é " + txt + " nº " + n + ".");

    scanner.close();


  }
  
}
