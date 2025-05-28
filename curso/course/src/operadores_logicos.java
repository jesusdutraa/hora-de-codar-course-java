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

      // neste caso o valor retornado será true se uma das duas opções retornar true

      boolean estaChovendo = false;
      boolean temGuardaChuva = true;

      System.out.println(estaChovendo || temGuardaChuva);


      // NOT 

      System.out.println(estaChovendo);
      // atenção pois ao engolbar os dois operadores com parenteses e o sinal de negação, todo o valor será negado novamente.
      System.out.println(!(estaChovendo || !temGuardaChuva));


  }
}
