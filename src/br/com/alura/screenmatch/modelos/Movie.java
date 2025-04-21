package br.com.alura.screenmatch.modelos;

//A expressão "extends", marca esse objeto sendo um "filho" do objeto titulo
//Ou seja, a classe Movie possue tudo oque a classe Titulo tem, além de;
//mais um atributo onde Titulo não possue, que é o diretor, e seus respectivos getters and sethers.

import br.com.alura.screenmatch.calculos.Classificavel;

//Lê-SE: A classe Movie é um Titulo.

//implements
public class Movie extends Titulo implements Classificavel {

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
