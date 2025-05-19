public class Condicional {


    public static void main(String[] args) {
        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";
        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme Retrô que vale apenas assistir!");
        }

        if (incluidoNoPlano && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }

        int teste = 3213;
        switch (teste) {
            case 1 -> System.out.println("Teste = 1");
            case 2 -> System.out.println("Teste = 2");
            case 3 -> System.out.println("Teste = 3");
            default -> System.out.println("Sei lá");
        }

    }
}
