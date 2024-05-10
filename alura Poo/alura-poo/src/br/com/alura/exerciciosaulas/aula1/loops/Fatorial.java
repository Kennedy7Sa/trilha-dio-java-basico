package br.com.alura.exerciciosaulas.aula1.loops;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um numero ");
        int numero = leitura.nextInt();

        int fatorial = 1 ;

        for (int i = 1; i <=numero ; i++) {
            fatorial *= i ;
        }
        System.out.println(String.format("O fatorial de %d é: %d",numero,fatorial));
    }
}
