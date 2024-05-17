package screenmatchPOO.exercicios.conversorMoedas;

public class ConversorMoedas implements ConversaoFinanceira{

   private double dolar;



    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }



    @Override
    public void converterDolarParaReal() {
        double conversao = dolar / 5.12;
        System.out.println(String.format("o valor em reais é %.2f ",conversao));
    }
}
