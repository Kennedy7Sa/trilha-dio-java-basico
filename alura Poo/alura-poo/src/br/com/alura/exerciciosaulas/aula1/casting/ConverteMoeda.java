package br.com.alura.exerciciosaulas.aula1.casting;

public class ConverteMoeda {
    public static void main(String[] args) {
        double valorEmDolares = 100.50;
        double taxaDeConversao = 4.94;

        double valorEmReais = valorEmDolares * taxaDeConversao;

        System.out.println("O valor em reais é: " + valorEmReais);
    }
}
