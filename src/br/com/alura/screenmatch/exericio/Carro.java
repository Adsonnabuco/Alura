package br.com.alura.screenmatch.exericio;

public class Carro {
    private String nome;
    private String marca;
    private int anoFabricacao1;
    private double preco;
    private int anoBase;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnoFabricacao1() {
        return anoFabricacao1;
    }

    public void setAnoFabricacao1(int anoFabricacao1) {
        this.anoFabricacao1 = anoFabricacao1;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAnoBase() {
        return anoBase;
    }

    public void setAnoBase(int anoBase) {
        this.anoBase = anoBase;
    }

    public void exibir(){
        System.out.println("Marca: "+ this.marca);
        System.out.println("Modelo: "+ this.nome);
        System.out.println("Ano: "+ this.anoFabricacao1);
    }

    public double mediaPrice(double valor){
        if (this.getAnoBase() == 2019){
            System.out.println("Média de valor desse ano foi de: " + valor);
        } else if (this.getAnoBase() == 2020) {
            System.out.println("Média de valor desse ano foi de: " + valor);
        } else if (this.getAnoBase() == 2021){
            System.out.println("Média de valor desse ano foi de: "+ valor);
        }
        return valor;
    }


}

