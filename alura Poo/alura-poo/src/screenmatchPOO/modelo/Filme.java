package screenmatchPOO.modelo;

public class Filme {
    String nome ;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private  double somaDasAvaliacoes;
    private int totalAvaliacoes;
    int duracaoEmMinutos;

    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }


    //metodo
    public void exibeFichaTecnica(){
        System.out.println(String.format("o nome do filme %s",nome));
        System.out.println(String.format("Ano de lançamento é %d",anoDeLancamento));
    }
     public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }
    public double pegaMedia(){
         return somaDasAvaliacoes/totalAvaliacoes;

    }
}
