import java.util.Arrays;
import java.util.Scanner;

public class exercicios_condicionais {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o preço do produto");
    double valor = scanner.nextDouble();

    if(valor <= 50){
      System.out.println("Barato");
    } else if( valor <= 100){
      System.out.println("Médio");
    }else{
      System.out.println("caro");
    }

    System.out.println("Digite o seu nome de usuário");

    String nomeLogin = scanner.nextLine();
    
    System.out.println("Digite a sua senha");
      String senha = scanner.nextLine();

    if (nomeLogin.equals("admin") && senha.equals("1234")){
      System.out.println("Acesso liberado");
    } else{
      System.out.println("Acesso negado");
    }

    // Terceiro exercicio / par - impar

      System.out.println("Qual número você escolhe para verificar?");
    int numero = scanner.nextInt();

    if((numero%2 == 1)){
      System.out.println("Seu número é "+ numero + " ele é número impar");
    }else {
      System.out.println("Seu número é "+ numero + " ele é número par");
    }


    System.out.println("Escolha um dia da semana onde a sequencia é a seguinte de 1 a 7 onde 1 representa domingo e 7 sábado");

    int dia = scanner.nextInt();
    
    switch (dia) {
      case 1:
        System.out.println("O seu dia escolhido é Domingo, e não é dia útil");
        break;

        case 2:
        System.out.println("O seu dia escolhido é Segunda, e é dia útil");
        break;

        case 3:
        System.out.println("O seu dia escolhido é Terça, e é dia útil");
        break;

        case 4:
        System.out.println("O seu dia escolhido é Quarta, e é dia útil");
        break;

        case 5:
        System.out.println("O seu dia escolhido é Quinta, e é dia útil");
        break;

        case 6:
        System.out.println("O seu dia escolhido é Sexta, e é dia útil");
        break;

        case 7:
        System.out.println("O seu dia escolhido é Sábado, e não é dia útil");
        break;
    
      default:
        System.out.println("Você não escolheu um número válido");
        break;
    }

    System.out.println("Insira o número que desejas verificar");
    int numVerificacao = scanner.nextInt();

    if(numVerificacao >= 10 && numVerificacao <= 20){
      System.out.println("Seu número está entre o internvalo");
    } else{
      System.out.println("Número fora do intervalo");
    }

      // exercicios de OR

      System.out.println("Digite a letra");

      String letra = scanner.nextLine();
      // achei um exemplo mt porco
      switch (letra) {
        case "a":
        case "e":
        case "i":
        case "o":
        case "u":
          System.out.println("Vogal");
          break;
      
        default:
        System.out.println("Consoante");         
         break;
      }


    scanner.close();


  }
}
