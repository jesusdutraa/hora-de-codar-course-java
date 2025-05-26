public class App {

    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        /*comentários*/ 
        // linha 

        String firstName = "Gabriel ";
        String lastName = "Dutra";
        String nomeCompleto = firstName + lastName;

        System.out.println(nomeCompleto);

        char letra = 'G'; // necessita usar aspas simples ''
        System.out.println(letra);

        //Operadores aritméticos

        int a = 1;
        int b = 2;

        System.out.println(a-b);
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a%b);
        System.out.println(a/b);

        // Operadores Aritméticos 2 

        int x = 5;

        x++;
        x++;
        x++;
        x++;
        x++;
        x++;

        System.out.println(x);

        int c = 10;
        int v = 10;
        v--;
        System.out.println(v);
        c -= 4;
        System.out.println(c);

        x += c;
        System.out.println(x);

        // int idade = 13;

        // if(idade <= 14){
        //     System.out.println("Jovem");
        // } else if(idade == 15 || idade <= 17){
        //     System.out.println("adolescente");
        // } else{
        //     System.out.println("velho");
        // }

        // INCREMENTO 
        // DECREMENTO 
        // ATRIBUIÇÃO ADITIVA
       // ATRIBUIÇÃO SUBTRATIVA

        // Type casting 

        // implicito (widening)
        int numero2 = 42;
        long numeroLong = numero2;
        double numeroDouble = numero2;
        System.out.println(numeroLong);
        System.out.println(numeroDouble);

        // explicito 

        double valorDouble = 9.23;
        int valorInt = (int) valorDouble;
        System.out.println(valorInt);

        char letra1 = 'G';
        int codigoAscii = (int) letra1;
        System.out.println(codigoAscii);

       

        int num = 10;
        int numDobro = num*2;
        System.out.println(numDobro);

        char letra2 = 'B';
        int valLetra = (int) letra2;
        System.out.println(valLetra);

        double valorEx01 = 15.75;
        double valorEx02 = 20.40;
        double soma = valorEx01 + valorEx02;
        System.out.println(soma);

        long valorGrande = 2_000_000_000L;
        int convertValorGrande = (int) valorGrande;
        System.out.println(convertValorGrande);

        String mensage = "Ola mundo";
        String finalMesage = mensage + " Bem-Vindo ao Java!";
        System.out.println(finalMesage);

        final int DIAS_DA_SEMANA = 7;
        System.out.println(DIAS_DA_SEMANA);

        // Var

        var varNum = 10;
        var numDouble = 10.4;

        System.out.println(varNum);
        System.out.println(numDouble);

        
    }


}