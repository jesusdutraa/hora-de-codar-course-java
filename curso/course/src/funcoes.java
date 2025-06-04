public class funcoes {
  public static void main(String[] args) {
    saudacao();
    soma(10, 8);
    saudar("Gabriel");
    int n = 1;
    int a =2;
    int b =3;
    int numeroDobrado = dobrar(n);
    System.out.println("O número dobrado é " + numeroDobrado);
    System.out.println(dobrar(12));
    int x = dobrar(somar(a,b));
    System.out.println(x);
    verificar(n);
  }
  

  // public => Nivel de acesso (público) => static => não precisa instanciar classe para executar, void => tipo de retorno (vazio)
  // Nome da função _ (os argumentos) _ bloco {}
  public static void saudacao(){
    System.out.println("Olá, esta é minha primeira função em Java.");
  }

  public static void soma(int a, int b){
    int resultado = a + b;
    System.out.println("O resultado da função de soma é " + resultado);

  }

  // neste exemplo o retorno é feito, porém não é impresso pois ele não teve a instrução de impressão
  public static int dobrar(int n){
    return n *2;
  }

  public static  void saudar(String nome){
     System.out.println(" olá " + nome);
     return;
     
  }

  // declarar a função e seu tipo de retorno e seu tipo de parâmetro....
  public static String verificar(int n){
    if (n % 2 == 0) {
      return "o número" + n + "é par";
      
    }else{
      return "o numero " + n + "É impar";
    }
  }

  public static int somar(int a, int b ){
    return a + b;
  }

    
}
