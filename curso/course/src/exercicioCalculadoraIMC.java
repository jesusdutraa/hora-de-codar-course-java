import java.util.Scanner;

public class exercicioCalculadoraIMC {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Insira seu peso (em KG)");

    double pesoKg = scanner.nextDouble();

    System.out.println("insira sua altura (em Cm");

    double altura = scanner.nextDouble();
    double alturam = altura / 100; // convertendo a altura para metros

    double calculo = pesoKg / (alturam * alturam);

  if (calculo < 18.5){
    System.out.println("Seu IMC é " +calculo + " você está abaixo do peso");
  } else if (calculo >= 18.5 && calculo <= 24.9){
    System.out.println("Seu IMC é " +calculo + " você está com seu peso normal");
  } else if (calculo >= 25 && calculo <= 29.9){
    System.out.println("Seu IMC é " +calculo + " você está acima do peso");
  } else{
    System.out.println("Seu IMC é " +calculo + " você está no grau de obesidade, tome cuidado e cuide da sua saúde");
  }




      scanner.close();
  }

}
