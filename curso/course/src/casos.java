public class casos {
  public static void main(String[] args) { 

    int diaDaSemana = 1;
    
    switch (diaDaSemana) {
      case 1:
      System.out.println("Domingo");
        break;

        case 2:
      System.out.println("Segunda");
        break;

        case 3:
      System.out.println("Terça");
        break;

        case 4:
      System.out.println("Quarta");
        break;

        case 5:
      System.out.println("Quinta");
        break;

        case 6:
      System.out.println("Sexta");
        break;

        case 7:
      System.out.println("Sábado");
        break;

      default:
        break;
    }


    int veiculo = 0;

    switch (veiculo) {
      case 1:
      System.out.println("Etacone no lugar das motos");
        break;

        case 2:
        System.out.println("Estacione Normalmente");
        break;

        case 3:
        System.out.println("Prosseiga para a faixa de pedestres");

    
      default:
      // nada disso deu certo então ele imprime isso
      System.out.println("ta no sanha filho");
        break;
    }


  }
}
