package screenmatchPOO;

import screenmatchPOO.calculos.CalculadoraDeTempo;
import screenmatchPOO.calculos.FiltroRecomendacao;
import screenmatchPOO.modelo.Filme;
import screenmatchPOO.modelo.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("O total das avaliaçoes : " + meuFilme.getTotalAvaliacoes());
        System.out.println(String.format("A media das avaliações é %.2f" , meuFilme.pegaMedia()));

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setMinutosPorEpisodio(50);
        lost.setEpisodiosPorTemporada(10);
        System.out.println("Duração para maratonar lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("mad max");
        outroFilme.setAnoDeLancamento(1970);
        outroFilme.setDuracaoEmMinutos(100);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Filme filmeDoPaulo = new Filme();
        filmeDoPaulo.setNome("007");
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.setAnoDeLancamento(2023);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(filmeDoPaulo);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println();
        }



}
