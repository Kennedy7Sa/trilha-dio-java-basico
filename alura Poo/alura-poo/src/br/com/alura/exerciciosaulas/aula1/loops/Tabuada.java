package br.com.alura.exerciciosaulas.aula1.loops;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero=0;
        System.out.println("Digite um numero inteiro ");
        numero = leitura.nextInt() ;

        for (int i = 1; i <= 10; i++) {
            int tabuada = numero * i;

            System.out.println(String.format("%d x %d = %d",numero , i , tabuada));
        }
    }
}
