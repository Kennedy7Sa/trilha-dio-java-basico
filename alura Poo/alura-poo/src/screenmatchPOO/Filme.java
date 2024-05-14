package screenmatchPOO;

public class Filme {
    String nome ;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalAvaliacoes;
    int duracaoEmMinutos;

    //metodo
    void exibeFichaTecnica(){
        System.out.println(String.format("o nome do filme %s",nome));
        System.out.println(String.format("Ano de lançamento é %d",anoDeLancamento));
    }
    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }
    double pegaMedia(){
        return somaDasAvaliacoes/totalAvaliacoes;

    }
}
