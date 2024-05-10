package br.com.alura.exerciciosaulas.aula1.loops;

import java.util.Scanner;

public class NegativoPositivo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero ;

        System.out.println("Digite um numero ");
        numero = leitura.nextInt();

        if (numero>0){
            System.out.println(String.format("O numero %d é positivo ",numero));
        }else{
            System.out.println(String.format("O numero %d é negativo",numero));
        }
    }
}
