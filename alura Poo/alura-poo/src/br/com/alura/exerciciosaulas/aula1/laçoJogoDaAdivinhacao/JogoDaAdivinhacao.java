package br.com.alura.exerciciosaulas.aula1.laçoJogoDaAdivinhacao;

import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100); // gerando um numero aleatorio
        int tentativa = 0;
        int numeroDigitado=0;

        //enquanto tentativas for menor que 5 faça
        while (tentativa < 5 ) {
            System.out.println(String.format("Digie um numero entre 0 e 100"));
            numeroDigitado = leitura.nextInt();
            tentativa++;

            if(numeroDigitado == numeroGerado){
                System.out.println(String.format("Parabens vc acertou em %d tentativas ",tentativa));
                break; // para interromper o loop while
            }else if(numeroDigitado< numeroGerado){
                System.out.println("Vc errou o numero secreto é maior");

            }else{
                System.out.println("O numero secreto é menor");
            }

            //se tentatica dor igual a 5 e numero digitado for diferente de numero ferado faça .
            if (tentativa == 5 && numeroDigitado != numeroGerado){
                System.out.println(String.format("Vc não conseguiu acertar o numero secreto em menos de 5 tentativas e o numero secreto é %d",numeroGerado));
            }

            }
        }
    }

