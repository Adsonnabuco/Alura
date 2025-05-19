public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");
        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluindoNoPlano = true;
        double notaDoFilme = 8.1;
        double media = 8.033333333333333;
        System.out.println(media);
        String sinopse = "Filme top Gun\nFilme de aventura dos anos 80;\nMuito bom!\nAno de lançamento\n" + anoDeLancamento;
        System.out.println(sinopse);
        int classificacao = (int)(media / (double)2.0F);
        System.out.println(classificacao);
    }
}
