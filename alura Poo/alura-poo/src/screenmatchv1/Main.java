package screenmatchv1;

public class Main {
    public static void main(String[] args) {
        //para printar coisas na tela
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top gun Maverick");

        //declarando variaveis
        int anoDeLancamento = 2022;  // camelcase
        System.out.println("Ano de lançamento "+ anoDeLancamento); // concatenando textos

        boolean incluidoNoPlano = true;  // só aceita true ou false (verdadeiro e falso)
        double notaDoFilme = 8.1; // valores com casas decimais

        double media = (9.8 + 6.3 + 8.0 )/ 3;
        System.out.println(String.format("%.2f",media));
        String sinopse ;
        sinopse = """
                aqui é uso do textblocks usa com 3 aspas 
                Filme top gun 
                Filme de aventura com galã do anos 80
                """+ anoDeLancamento;
        System.out.println(sinopse);


       //usando o casting para alterar de float  pra int
        int classificacao;
        classificacao =(int) media / 2 ;
        System.out.println("Classificação do filme " + classificacao +"estrelas");



    }
}
