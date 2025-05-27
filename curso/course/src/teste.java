import java.util.Scanner;
public class teste {




        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int escolha = -1;
            while (escolha != 0) {

                System.out.println("MENU PRINCIPAL ");
                System.out.println("1 - Calculadora");
                System.out.println("2 - Controlador de gastos pessoais");
                System.out.println("3 - Gasto de gasolina por dia");
                System.out.println("4 - Calculadora de desconto");
                System.out.print("Escolha uma opção: ");
                escolha = scanner.nextInt();

                // Opção 1 - Calculadora

                if (escolha == 1) {
                    double valor01, valor02, resultado = 0;
                    String operacao;

                    System.out.println(" CALCULADORA ");
                    System.out.print("Digite o primeiro número: ");
                    valor01 = scanner.nextDouble();

                    System.out.print("Digite a operação (+, -, *, /): ");
                    operacao = scanner.next();

                    System.out.print("Digite o segundo número: ");
                    valor02 = scanner.nextDouble();

                    if (operacao.equals("+")) {
                        resultado = valor01 + valor02;

                    } else if (operacao.equals("-")) {
                        resultado = valor01 - valor02;

                    } else if (operacao.equals("*")) {
                        resultado = valor01 * valor02;

                    } else if (operacao.equals("/")) {
                        resultado = valor01 / valor02;
                    }

                    System.out.println("Resultado: " + resultado);
                }

                // Opção 2 - Controlador de gastos

                else if (escolha == 2) {
                    double saldo1, gasto, totalGastos = 0;
                    int quantidadeGastos;

                    System.out.println(" CONTROLADOR DE GASTOS ");

                    System.out.print("Digite o valor do seu dinheiro disponível: R$ ");
                    saldo1 = scanner.nextDouble();

                    System.out.print("Quantos gastos você quer registrar? ");
                    quantidadeGastos = scanner.nextInt();

                    for (int i = 1; i <= quantidadeGastos; i++) {
                        System.out.print("Digite o valor do gasto " + i + ": R$ ");
                        gasto = scanner.nextDouble();
                        totalGastos += gasto;
                        saldo1 -= gasto;
                    }

                    System.out.println("Total de gastos: R$ " + totalGastos);
                    System.out.println("Saldo restante: R$ " + saldo1);
                }

                // Opção 3 - Gasto de gasolina por dia

                else if (escolha == 3) {

                    System.out.print("KM por dia (ida e volta): ");
                    double kmDia = scanner.nextDouble();

                    System.out.print("KM por litro do carro: ");
                    double kmLitro = scanner.nextDouble();

                    System.out.print("Preço da gasolina: ");
                    double preco = scanner.nextDouble();

                    double litros = kmDia / kmLitro;
                    double gastoDia = litros * preco;

                    System.out.println("Gasto por dia: R$ " + gastoDia);

                }

                // Opção 4 CALCULADORA DE DESCONTO

                else if (escolha == 4) {
                    System.out.println(" CALCULADORA DE DESCONTO ");

                    System.out.print("Digite o valor original do produto: R$ ");
                    double valorOriginal = scanner.nextDouble();

                    System.out.print("Digite o percentual de desconto (%): ");
                    double desconto = scanner.nextDouble();

                    double valorDesconto = (valorOriginal * desconto) / 100;
                    double valorFinal = valorOriginal - valorDesconto;

                    System.out.println("Desconto: R$ " + valorDesconto);
                    System.out.println("Valor com desconto: R$ " + valorFinal);

                    scanner.close();

                }
            }
        }








}
