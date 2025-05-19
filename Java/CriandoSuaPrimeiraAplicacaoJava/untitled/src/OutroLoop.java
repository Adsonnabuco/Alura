import java.util.Scanner;

public class OutroLoop {
    public OutroLoop() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mediaAvalicao = (double)0.0F;
        double nota = (double)0.0F;
        int totalDeNotas = 0;

        while(nota != (double)-1.0F) {
            System.out.println("Diga sua avalição para o filme ou -1 para encerrar ");
            nota = scan.nextDouble();
            if (nota != (double)-1.0F) {
                mediaAvalicao += nota;
                ++totalDeNotas;
            }
        }

        System.out.println("Média de avaliações " + mediaAvalicao / (double)totalDeNotas);
    }
}
