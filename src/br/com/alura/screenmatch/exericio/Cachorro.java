package br.com.alura.screenmatch.exericio;

public class Cachorro extends Animal{

    public void passeio(){
        System.out.println("Adoro passear no parque.");
    }

    public void abanarRabo(){
        System.out.println("Normalmente quando escuto alguem chegando abano muito o meu rabo.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au-Au-Au");
    }
}
