package br.com.alura.exerciciosaulas.aula1.loops;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ComparaNumeros {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.println("Digite o primeiro numero");
        numero1 = leitura.nextInt();
        System.out.println("Digite o segundo numero");
        numero2 = leitura.nextInt();

        if (numero1 == numero2){
            System.out.println("Os dois numeros são iguais ");
        } else{
            System.out.println("Os dois numeros são diferentes ");

        }
            if (numero1 > numero2 && numero1 == numero2){
                System.out.println("O primeiro numero é maior ");

            } else if (numero1 < numero2 && numero1 != numero2) {
                System.out.println("O segundo numero é maior ");
            }

        }
    }

