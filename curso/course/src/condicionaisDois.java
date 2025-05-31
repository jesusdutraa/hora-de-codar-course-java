public class condicionaisDois {
  public static void main(String[] args) {
    int numero = 11;

    String resultado = (numero % 2 == 0) ? "O número é par" : "O número é Ímpar";

    System.out.println(resultado);

     // if else aninhado
    int idade = 18;

    boolean temCarteira = false;

    if(idade >= 18){
        if(temCarteira){
            System.out.println("Pode dirigir");
        }else{
          System.out.println("Necessita de habilitação");
        }
    }else{
        System.out.println("Você ainda não possui idade suficiente para dirigir");
    }

    // precedencia

    boolean a = true;
    boolean b = false;
    boolean c = true;

      // true or (true and false > false) > true
    boolean resultado2 = (a || c && b);

    System.out.println(resultado2);
    // (true and false > false) or true > true
    boolean resultado3 = (a && b || c);

    System.out.println(resultado3);

    // NOT (TRUE AND TRUE) > FALSE OR FALSE > FALSE
    boolean resultado4 = !(a && c) || b;

    System.out.println(resultado4);




  }
}
