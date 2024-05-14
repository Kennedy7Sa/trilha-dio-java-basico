package screenmatchPOO;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("A soma das valiaçoes é " + meuFilme.somaDasAvaliacoes);
        System.out.println("O total das avaliaçoes é " + meuFilme.totalAvaliacoes);
        System.out.println(String.format("A media das avaliações é %.2f" , meuFilme.pegaMedia()));
        }
}
