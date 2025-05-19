import java.util.Scanner;

public class Looping {
    public Looping() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mediaAvalicao = (double)0.0F;
        double nota = (double)0.0F;

        for(int i = 0; i < 3; ++i) {
            System.out.println("Diga sua avalição para o filme ");
            nota = scan.nextDouble();
            mediaAvalicao += nota;
        }

        System.out.println("Média de avaliações " + mediaAvalicao / (double)3.0F);
    }
}
