import java.util.Scanner;

public class Pratica_03 {
    public Pratica_03() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("********** Pratica 01 **********");
        System.out.println("Digite um número:");
        int number = scan.nextInt();
        if (number > 0) {
            System.out.println("Esse número é um número positivo.");
        } else if (number < 0) {
            System.out.println("Esse número é um número negativo.");
        } else {
            System.out.println("Você me informou o número zero né...?");
        }

        System.out.println("********** Pratica 02 **********");
        System.out.println("Digite 2 números inteiros:");
        int number1 = scan.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        int number2 = scan.nextInt();
        if (number1 == number2) {
            System.out.println("São iguais.");
        } else if (number1 != number2) {
            System.out.println("São diferentes.");
        }

        if (number1 > number2) {
            System.out.println("O primeiro número: " + number1 + " é maior do que o segundo número: " + number2);
        } else if (number2 > number1) {
            System.out.println("O Segundo número: " + number2 + " é maior do que o primeiro número: " + number1);
        }

        System.out.println("********** Pratica 03 **********");
        System.out.println("1. Calcular área do quadrado ou 2. Calcular área do círculo");
        int number3 = scan.nextInt();
        switch (number3) {
            case 2 -> System.out.println("Voce optou por calcular a área do circulo.");
            case 3 -> System.out.println("Você escolheu Calcular a área do quadrado.");
            default -> System.out.println("Escolha uma opção válida.");
        }

        System.out.println("********** Pratica 04 **********");
        System.out.println("Digite um número para exibir a tabuada.");
        int choice = scan.nextInt();
        System.out.println("Tabuada do " + choice + " de 1 até o 10.");

        for (int i = 0; i <= 10; ++i) {
            System.out.println(i + " x " + choice + " = " + i * choice);
        }

        System.out.println("********** Pratica 05 **********");
        System.out.println("Digite um número para que eu identifique se é par ou impar:");
        int entrada = scan.nextInt();
        int k = entrada % 2;
        if (k == 0) {
            System.out.println("Esse número é par.");
        } else if (k == 1) {
            System.out.println("Esse número é impar.");
        }

        System.out.println("********** Pratica 06 **********");
        System.out.print("Digite um número: ");
        int numero = scan.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numero; ++i) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}

