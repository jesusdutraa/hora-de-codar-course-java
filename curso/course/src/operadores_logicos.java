public class operadores_logicos {
  public static void main(String[] args) {
    
    boolean temCarteitaDeMotorista = true;
    int idade = 18;
    System.out.println(idade >= 18 && temCarteitaDeMotorista);

    int a = 10;
    int b = 20;

    // true = true => true 
    if(a > 5 && b > 100){
      System.out.println("Deu certo");
    }else{ // true = false => false
      System.out.println("Não deu certo");
    }
  }
}
