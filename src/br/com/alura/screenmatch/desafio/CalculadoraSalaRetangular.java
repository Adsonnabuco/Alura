package br.com.alura.screenmatch.desafio;

public class CalculadoraSalaRetangular implements CalculoGeometrico{

    private double altura;
    private double largura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }


    public double calcularArea(){
        double area;
        area = altura * largura;
        return area;
    }

    public double calcularPerimetro(){
        double perimetro;
        perimetro = (altura *2) + (largura * 2);
        return perimetro;
    }


}
