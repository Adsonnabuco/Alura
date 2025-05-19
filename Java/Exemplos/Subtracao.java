public class Subtracao {
    public static void main(String[] args) {
        System.out.println(10 - 5);

        int idade = 25;
        String nome = "Adson";
        double valor = 25.4;

        System.out.println(String.format("Olá, Me chamo %s, tenho %d anos e hoje já começei o dia gastanto %.2f reais", nome, idade, valor));

        int aulas = 50;
        String mensagem = """
                            Olá, %s!
                            Boas vindas ao curso de Java.
                            Teremos %d aulas para te mostrar oque é preciso para vc conseguir resolver as coisas!
                            """.formatted(nome, aulas);
        System.out.println(mensagem);


    }
}
