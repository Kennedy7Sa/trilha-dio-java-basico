package br.com.alura.exerciciosaulas.aula1.casting;

public class CalculaPreco {
    public static void main(String[] args) {
        double precoProduto = 5.5;
        int quantidade = 10 ;
       double resultado  =  precoProduto * quantidade;
        System.out.println(String.format("O preço da venda R$ %.2f ",resultado));
    }
}
