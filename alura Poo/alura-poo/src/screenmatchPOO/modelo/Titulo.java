package screenmatchPOO.modelo;

public class Titulo {
    String nome ;
    private  int anoDeLancamento;
    private  boolean incluidoNoPlano;
    private  double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;

    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
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
