package screenmatchv1;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in); // para ter entradas do teclado
        System.out.println("Digite seu filme favorito ");
        String Filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Digite sua avaliação para o filme ");
        double avaliacao = leitura.nextDouble();

        System.out.println("Seu filme é " + Filme);
        System.out.println("Ano de lançamento "+anoDeLancamento);
        System.out.println("Sua avaliação é "+ avaliacao);

    }
}
