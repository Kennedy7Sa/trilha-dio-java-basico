package br.com.alura.exerciciosaulas.aula1.excasting;

public class CalculaMedia {
    public static void main(String[] args) {
        double nota1 = 6.3 ;
        double nota2 = 7;
        String nomeAluno = "Kennedy";
        char sexo= 'M';

        double resultado  = (nota1 + nota2) / 2 ;
    System.out.println(String.format("Nome do aluno %s o sexo dele é %c A média das notas é %.2f",nomeAluno, sexo,resultado ));
    }
}
