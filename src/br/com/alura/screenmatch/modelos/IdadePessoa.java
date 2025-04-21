package br.com.alura.screenmatch.modelos;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade(){
        if (this.idade <= 17) {
            System.out.println("Você é de menor aqui no Brasil.");
        } else if (this.idade >= 18) {
            System.out.println("Você já é de maior aqui no Brasil");
        }
    }


}
