import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public JogoDeAdivinhacao() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você terá 5 tentativas para adinvinhar o numero aleatório de 1 a 100.");
        int numero = (new Random()).nextInt(100);
        int tentativa = 0;
        int paupite = 0;

        for(int i = 0; i < 5; ++i) {
            if (paupite == numero) {
                System.out.println("Parabéns");
                break;
            }

            System.out.println("Tente");
            paupite = scanner.nextInt();
        }

    }
}
