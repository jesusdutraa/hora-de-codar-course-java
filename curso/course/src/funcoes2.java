public class funcoes2 {
  public static void main(String[] args) {

    

    String p1 = verificar(18, true, false);
    System.out.println(p1);

    String p2 = verificar(13, true, true);

    System.out.println(p2);
    
  }

  public static String verificar(int idade, Boolean temCarteira, Boolean TemHistoricoNegativo){

    if(idade >= 18 && temCarteira && !TemHistoricoNegativo){
      return "Acesso permitido todos os requisitos foram entregues";
      
    }else {
      return "Acesso negado, requisitos incompletos";
    }
  }
}
