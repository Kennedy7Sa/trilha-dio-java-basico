package br.com.alura.exerciciosaulas.aula1.loops;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero ;
        System.out.println("Digite um numero ");
        numero = leitura.nextInt();
        // usando o resto da divisão para saber se um numero é impar ou não

        if (numero %2 == 0){
            System.out.println(String.format("O numero %d é par ",numero));
        }else {
            System.out.println(String.format("O numero %d é impar ",numero));
        }
    }
}
