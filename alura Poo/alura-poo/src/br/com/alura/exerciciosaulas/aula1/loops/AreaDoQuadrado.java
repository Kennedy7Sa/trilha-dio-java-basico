package br.com.alura.exerciciosaulas.aula1.loops;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class AreaDoQuadrado {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcao = 0 ;
        double ladoQuadrado;
        double raio;
        final double  PI = 3.14;


        while  (opcao !=3){
            System.out.println("""
                 **********Digite a opção******** 
                 1 para calcular area do quadrado
                 2 para calcular area do circulo
                 3 para sair   
                 ********************************              
                """);
            opcao = leitura.nextInt();
         if (opcao == 1){
             System.out.println("****Calculando a aarea do quadrado *****");
             ladoQuadrado = leitura.nextDouble();
             double areaQuadrado = ladoQuadrado * ladoQuadrado;
             System.out.println(String.format("A area do quadrado é %.2f",areaQuadrado));
         } else if (opcao == 2 ) {
             System.out.println("*****Calculando a area de um circulo ****");
            raio = leitura.nextDouble();
            double areaDoCirculo = PI * (raio * raio);
             System.out.println("a area do ciruclo é "+areaDoCirculo);
         }else if (opcao == 3){
             System.out.println("Programa encerrado");
         }else {
             System.out.println("Opcão invalida");
         }
        }


    }
}
