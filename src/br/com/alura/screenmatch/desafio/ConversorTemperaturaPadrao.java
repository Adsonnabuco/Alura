package br.com.alura.screenmatch.desafio;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public void celsiusParaFahrenheit(int number) {
        int result = (number * 9/5) + 32;
        System.out.println(number + " celcius é equivalente a " + result + " Fahrenheit.");
    }

    @Override
    public void fahrenheitParaCelsius(int number) {
        int result = (number - 32) * 5/9;
        System.out.println(number + " fahrenheit é equivalente a " + result + " Celsius.");
    }
}
