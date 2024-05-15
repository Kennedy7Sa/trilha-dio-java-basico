package screenmatchPOO.exercicios;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;

    double somaDasAvaliacoes;
    int numAvaliacoes;

    void exibiFichaTecnica() {
        System.out.println(String.format("""
                Titulo da música %s 
                nome do artista %s 
                ano de lançamento %d""", titulo, artista, anoLancamento));

    }

    void avalia(double nota ){
        somaDasAvaliacoes += nota;
        numAvaliacoes++;
    }
    double pegaMedia(){
        return somaDasAvaliacoes/numAvaliacoes;
    }
}