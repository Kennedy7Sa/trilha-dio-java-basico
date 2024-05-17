package screenmatchPOO.calculos;

import screenmatchPOO.modelo.Filme;
import screenmatchPOO.modelo.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }
//    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
    public  void inclui (Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
