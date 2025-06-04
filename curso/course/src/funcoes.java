public class funcoes {
  public static void main(String[] args) {
    saudacao();
    soma(10, 8);
    saudar("Gabriel");
    int n = 1;
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

  public static int dobrar(int n){
    return n *2;
  }

  public static  void saudar(String nome){
     System.out.println(" olá " + nome);
     return;
     
  }
}
