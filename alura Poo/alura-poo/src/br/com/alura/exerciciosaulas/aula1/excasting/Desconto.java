package br.com.alura.exerciciosaulas.aula1.excasting;

public class Desconto {
    public static void main(String[] args) {
        double precoOriginal = 10 ;
        double percentualDesconto = 10 ;
         double valorDesconto = (percentualDesconto/100) * precoOriginal ;
         double novoPreco = precoOriginal- valorDesconto;
        System.out.println(String.format("O desconto sobre o preço de %.2f é %.2f valor com desconto %.2f ",precoOriginal,percentualDesconto,novoPreco));
    }
}
