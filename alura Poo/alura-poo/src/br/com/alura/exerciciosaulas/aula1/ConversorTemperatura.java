package br.com.alura.exerciciosaulas.aula1;

public class ConversorTemperatura {
    public static void main(String[] args) {
        double temCelsius  = 30 ;

        double converção  =  (temCelsius * 1.8) +32 ;
        System.out.println(String.format("A conversão de %.0f graus é equivalente a  %.2f Fahrenheit",temCelsius,converção));
    }
}
