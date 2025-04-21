package br.com.alura.screenmatch.exericio;

public class Base {
    public static void main(String[] args) {
//        Carro carro = new Carro();
//        carro.setNome("Subaro");
//        carro.setMarca("Toyota");
//        carro.setAnoFabricacao1(2001);
//        carro.setAnoBase(2019);
//
//        carro.exibir();
//        carro.mediaPrice(140.000);

        Cachorro dog = new Cachorro();
        dog.emitirSom();
        dog.abanarRabo();
        dog.passeio();

        Gato cat = new Gato();
        cat.emitirSom();
        cat.arranharMoveis();
        cat.brinquedo();

        System.out.println("_________________________________________________________________________________________");

        ContaBancaria cb = new ContaBancaria();
        cb.depositar(500);
        cb.consultarSaldo();

        ContaCorrente cc = new ContaCorrente();
        cc.depositar(500);
        cc.consultarSaldo();
        System.out.println("Seu saldo atual é: "+ cc.cobrarTarifaMensal(40));

        System.out.println("_________________________________________________________________________________");

        NumerosPrimos primos = new NumerosPrimos();
        primos.setNum(4);
        primos.verificarPrimalidade();



    }
}
