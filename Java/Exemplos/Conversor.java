public class Conversor {
    public static void main(String[] args) {

        int celcius = 14;
        double resultado;

        resultado = celcius * 1.8 +32;

        int finall = (int) resultado;
        System.out.println(String.format("A temperatura em Fahrenheit é : %d", finall));

    }
}
