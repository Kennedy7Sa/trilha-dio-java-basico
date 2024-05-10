package screenmatchv1;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in); // para ter entradas do teclado
        double mediaAvaliacao =0;
        double nota = 0 ;
        //faça até com o for
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua avaliação para o filme ");
            nota = leitura.nextDouble();
            mediaAvaliacao +=  nota ;
        }
        System.out.println("Media de avaliaçoes " + mediaAvaliacao/3);



    }
}
