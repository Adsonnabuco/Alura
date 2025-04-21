package br.com.alura.screenmatch.modelos;

public class Livro {
    private String nome;
    private String autor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exivirDetalhes(){
        System.out.println("O nome do livro é: " + this.nome);
        System.out.println("O seu autor é: " + this.autor);
    }
}
