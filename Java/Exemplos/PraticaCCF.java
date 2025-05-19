public class PraticaCCF {

    public static void main(String[] args) {
        System.out.println("*****************************PRATICA 01*****************************");

        double nota1 = 7.3;
        double nota2 = 4.6;

        double media = (nota1 +nota2) /2;

        System.out.println("A média das notas informadas é: " + media);

        System.out.println("*****************************PRATICA 02*****************************");

        double nota3 = 4.3;
        int nota4 = 9;

        int soma = (int)(nota3 + nota4);
        System.out.println(soma);

        System.out.println("*****************************PRATICA 03*****************************");

        char sexo = 'm';
        String nome = "Adson";
        System.out.println(String.format("Olá, me chamo %s, e sou já chegue a emagrecer a ponto de vestir uma roupa de tamnho %s.", nome, sexo));

        System.out.println("*****************************PRATICA 04*****************************");

        double precoProduto = 67.99;
        int quantidade = 3;

        double resultado1 = precoProduto * quantidade;
        System.out.println("Preço final: " + resultado1);

        System.out.println("*****************************PRATICA 05*****************************");

        double valorEmDolares = 15.43;
        double cotacaoDollar = 4.95;

        double resultado2 = valorEmDolares * cotacaoDollar;
        System.out.println("O valor final do produto é " + resultado2 + " R$.");

        System.out.println("*****************************PRATICA 06*****************************");

        double precoFinal = 84.54;
        double percentualDesconto = 15;

        double resultado3 = precoFinal * (1 - percentualDesconto /100);
        System.out.println("Preço final é igual a: "+ resultado3);


    }


}
