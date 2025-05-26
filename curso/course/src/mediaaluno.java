import java.util.Scanner;

public class mediaaluno {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome do aluno");
        String nome = scanner.nextLine();
        System.out.println("Insira a primeira nota");
        double n1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Insira a segunda nota");
        double n2 = scanner.nextDouble();

        System.out.println("Insira a terceira nota");
        double n3 = scanner.nextDouble();

        double media = (n1 + n2 + n3) /3;

        if(media >= 7){
            System.out.println("Olá "+ nome + " sua média foi " + media +", você está Aprovado");
        } else{
            System.out.println("Olá "+ nome + " sua média foi " + media +", você está Reprovado");
        }



        scanner.close();





    }
}
