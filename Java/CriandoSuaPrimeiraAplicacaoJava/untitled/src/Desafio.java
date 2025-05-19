import java.util.Scanner;

public class Desafio {
    public Desafio() {
    }

    public static void main(String[] args) {
        String nome = "Adson";
        String tipoConta = "Corrente";
        double saldo = (double) 2500.0F;
        boolean option = true;
        double valor = (double) 0.0F;
        System.out.println("************************************");
        System.out.println("Dados iniciais do Cliente:");
        System.out.println("");
        System.out.println("Nome:             " + nome);
        System.out.println("Tipo conta:       " + tipoConta);
        System.out.println("Saldo inicial:    R$ " + saldo);
        System.out.println("************************************");
        System.out.println();

        while (option) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Operações");
            System.out.println();
            System.out.println("1 - Consultar saldos");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.println("Digite a opção desejada: ");
            int input = scan.nextInt();
            Scanner variavel = new Scanner(System.in);
            switch (input) {
                case 1:
                    System.out.println("O saldo atual é: " + saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor que deseja receber:");
                    valor = variavel.nextDouble();
                    saldo += valor;
                    break;
                case 3:
                    System.out.println("Informe quando iremos transferrir");
                    valor = variavel.nextDouble();
                    if (saldo < valor) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= valor;
                    }
                    break;
                case 4:
                    System.out.println("Saindo.");
                    option = false;
                    break;
                default:
                    System.out.println("Digite uma opção válida.");
            }
        }

    }
}

