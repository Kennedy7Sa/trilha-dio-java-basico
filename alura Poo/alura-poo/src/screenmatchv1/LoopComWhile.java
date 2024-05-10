package screenmatchv1;

import java.util.Scanner;

public class LoopComWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in); // para ter entradas do teclado
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        //faça enquanto  com o while
        while (nota != - 1) {
            System.out.println("Digite sua avaliação para o filme ou -1 para encerrar ");
            nota = leitura.nextDouble();
            if (nota != -1){
                mediaAvaliacao += nota;
                totalDeNotas++;
            }

        }
        System.out.println("Media de avaliaçoes " + mediaAvaliacao / totalDeNotas);
    }
}