package screenmatchPOO.exercicios;

import java.util.Scanner;

public class PrincipalExercicios {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.saudacao();

        Calculadora calculadora = new Calculadora();
        System.out.println("Digite um numero para ver o dorbro do mesmo");
        Scanner leitura = new Scanner(System.in);
       int resultado =  calculadora.dobrarNumero(leitura.nextInt());


        System.out.println("o dobro é " + calculadora.dobrarNumero(leitura.nextInt()));





    }




}
