public class operadores {
    public static void main(String[] args) {
        int x = 10;

      /*  System.out.println(x == 10);
        System.out.println(x != 5);
        System.out.println(x == 0);
        System.out.println(x != 10);
        System.out.println(x > 10);
        System.out.println(x < 10);
        System.out.println(x >= 5);
        System.out.println(x <= 9); */

        // Atribuição e comparação

        var f = 10;
        // var s == 10;

        // Comparação de Strings

        String n1 = "java";
        String n2 = new String("java");

        System.out.println(n1 == n2);
        System.out.println(n1 == "java");
        System.out.println(n1.equals(n2));
        System.out.println(n1.equalsIgnoreCase(n2));

        String testo = "teste";

        if (testo.equals("teste")){
            System.out.println("O texto é igual");

        }

        int n = 10;

        if(n > 5){
            System.out.println("é maior");
        }

        // else if

        double nota = 8.9;

        if (nota >= 9){
            System.out.println("Nota Muito Boa");

        } else if (nota >= 7){
            System.out.println("Nota na média");
        } else{
            System.out.println("Nota abaixo da média");
        }

        int t = 4;

        if (t > 2 && t < 3){
            System.out.println("Maior");
        } else{
            System.out.println("Igual");
        }
    }
}
