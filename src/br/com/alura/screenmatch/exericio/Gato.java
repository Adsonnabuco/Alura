package br.com.alura.screenmatch.exericio;

public class Gato extends Animal{

    public void brinquedo(){
        System.out.println("Seu brinquedo preferido é um rato de pelúcia.");
    }

    public void arranharMoveis(){
        System.out.println("Adoro rasgar o sofá, cadeiras, tudo oque posso afiar minhas unhas.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau-Miau");
    }
}
