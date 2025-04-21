package br.com.alura.screenmatch.modelos;

public class Musica {
    private String titulo;
    private String artista;
    private int anoLancamento;
    private int avalicao;
    private int numAvalicao;
    private double somaDasNotas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getNumAvalicao() {
        return numAvalicao;
    }

    public void setNumAvalicao(int numAvalicao) {
        this.numAvalicao = numAvalicao;
    }

    public double getSomaDasNotas() {
        return somaDasNotas;
    }

    public void exibeFichaTecnica(){
        System.out.println(this.titulo);
        System.out.println(this.artista);
        System.out.println(this.anoLancamento);
    }

    public void avaliar(int nota){
        somaDasNotas += nota;
        numAvalicao++;
    }

    public double mediaAvaliacoes(){
        return somaDasNotas / numAvalicao;
    }

}
