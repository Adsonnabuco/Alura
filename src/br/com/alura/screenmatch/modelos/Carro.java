package br.com.alura.screenmatch.modelos;

public class Carro {
    public String modelo;
    public int ano;
    public String cor;
    public String descricao;

    public void exibirFicha(){
        System.out.println(this.modelo);
        System.out.println(this.ano);
        System.out.println(this.cor);
        System.out.println(this.descricao);
    }

    public int idade(){
        int anoBase = 2025;
        return anoBase - ano;
    }

}
