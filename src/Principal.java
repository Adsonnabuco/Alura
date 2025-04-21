import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.*;

public class Principal {
    public static void main(String[] args) {

    Serie lost =  new Serie();
    lost.setNome("Lost");
    lost.setAnoDeLancamento(2000);
    lost.exibeFichaTecnica();
    lost.setTemporadas(5);
    lost.setEpisodiosPorTemporada(15);
    lost.setMinutosPorEpisodio(40);
    System.out.println("Para maratorar a série " + lost.getNome() + " você precisa de "+lost.getDuracaoEmMinutos()+ " minutos.");



        // tipo referência //
        Movie meuFilme = new Movie();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1979);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(false);

        meuFilme.incluido();

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(3);
        meuFilme.avalia(5);
        meuFilme.avalia(4.5);
        System.out.println( "Total de avaliações: "+ meuFilme.getTotalAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Movie outroFilme = new Movie();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());
//

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);

        filtro.filtrar(episodio);


//
//        System.out.println("___________________________");
//        Pessoa pessoa = new Pessoa();
//        pessoa.Hey();
//        System.out.println("___________________________");
//
//        Calculadora calculadora = new Calculadora();
//        System.out.println("O valor desejado é: "+ calculadora.dobro(4));
//
//        System.out.println("___________________________");
//
//        Musica musica = new Musica();
//        musica.setTitulo("Faroeste do Caboclo.");
//        musica.setArtista("Legião Urbana");
//        musica.setAnoLancamento(1987);
//
//        musica.exibeFichaTecnica();
//
//        musica.avaliar(8);
//        musica.avaliar(6);
//        musica.avaliar(7);
////        musica.avaliar();
//        System.out.println(musica.getSomaDasNotas());
//        System.out.println(musica.getNumAvalicao());
//        System.out.println(musica.mediaAvaliacoes());
//
//        System.out.println("___________________________");
//
//        Carro carro = new Carro();
//        carro.modelo = "Civic";
//        carro.ano = 2020;
//        carro.cor = "Preto";
//        carro.descricao = "Exercicio Alura.";
//
//        carro.exibirFicha();
//
//        System.out.println("Idadedo carro é: "+ carro.idade() + " anos.");
//        System.out.println("___________________________");
//
//        Aluno aluno = new Aluno();
//        aluno.nome = "Jorge";
//        aluno.idade = 24;
//
//        aluno.exibir();
//
//        System.out.println("---------------------------------------------------------------");
//
//        IdadePessoa idadepessoa = new IdadePessoa();
//        idadepessoa.setNome("Teste");
//        idadepessoa.setIdade(17);
//
//        idadepessoa.verificarIdade();
//
//        System.out.println("---------------------------------------------------------------");
//
//        Produto produto = new Produto();
//        produto.setNome("Produto 1");
//        produto.setPreco(500f);
//
//        System.out.println("O valor total com o desconto é de: " + produto.aplicarDesconto(16));
//
//        System.out.println("---------------------------------------------------------------");
//
//        Alunos aluno1 = new Alunos();
//        aluno1.setNome("Joao");
//        aluno1.setNotas(10);
//        aluno1.setNotas(6);
//        aluno1.setNotas(4);
//
//        Livro livro1 = new Livro();
//        livro1.setAutor("Adson Nabuco");
//        livro1.setNome("Como se tornar um milionário.");
//
//        livro1.exivirDetalhes();

    }
}