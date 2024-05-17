package screenmatchPOO.exercicios;

import java.util.Scanner;

public class PrincipalExercicios {
    public static void main(String[] args) {
//        Pessoa pessoa = new Pessoa();
//        pessoa.saudacao();
//
//        Calculadora calculadora = new Calculadora();
//        System.out.println("Digite um numero para ver o dorbro do mesmo");
//        Scanner leitura = new Scanner(System.in);
//       int resultado =  calculadora.dobrarNumero(leitura.nextInt());
//
//
//        System.out.println("o dobro é " + calculadora.dobrarNumero(leitura.nextInt()));

//        Musica novaMusica = new Musica();
//        novaMusica.titulo = "Meu tributo ";
//        novaMusica.artista = "Vitorino Silva ";
//        novaMusica.anoLancamento=1999;
//
//
//       novaMusica.exibiFichaTecnica();
//
//        novaMusica.avalia(4.5);
//        novaMusica.avalia(5);
//        novaMusica.avalia(10);
//
//        double mediaAvaliacoes = novaMusica.pegaMedia();
//        System.out.println(String.format("A media das avaliações: %.2f",mediaAvaliacoes));
//
//    }
//    Carro meuCarro = new Carro();
//        meuCarro.modelo = "Fox ";
//        meuCarro.ano = 2010;
//        meuCarro.cor = "Cinza";
//
//        meuCarro.fichaTecnica();
//
//        System.out.println("idade do meu carro " + meuCarro.calculaIdade());

//        System.out.println("digite a idade ");
//        Scanner leitura = new Scanner(System.in);
//        IdadePessoa pessoa = new IdadePessoa();
//
//        int ano =  pessoa.setIdade(leitura.nextInt());
//        pessoa.verificarIdade(ano);

//        System.out.println("digite o nome do produto    ");
//        Scanner leitura = new Scanner(System.in);
//        Produto produto = new Produto();
//        produto.setNome(leitura.nextLine());
//        System.out.println("Digite o valor do produto");
//        produto.setPreco(leitura.nextDouble());
//       // System.out.println("Digite o valor do desconto ");
//       //
//        System.out.println( "o nome do produto  e o valor " + produto.getNome()+" R$"+produto.getPreco());
//        System.out.println("Digite o valor do desconto ");
//        double desconto = leitura.nextDouble();
//
//        produto.aplicaDeconto(desconto);
//        System.out.println("Novo após desconto " + produto.getPreco());

//        {
//            Aluno aluno1 = new Aluno("Lulu", 7.5, 8.0, 9.2);
//            Aluno aluno2 = new Aluno("Karina", 6.8, 7.3, 8.5);
//
//            System.out.println("Aluno 1:");
//            System.out.println("Nome: " + aluno1.getNome());
//            System.out.println("Nota 1: " + aluno1.getNotas1());
//            System.out.println("Nota 2: " + aluno1.getNotas2());
//            System.out.println("Nota 3: " + aluno1.getNotas3());
//            System.out.println("Média: " + aluno1.calculaMedia());
//            System.out.println();
//
//            System.out.println("Aluno 2:");
//            System.out.println("Nome: " + aluno2.getNome());
//            System.out.println("Nota 1: " + aluno2.getNotas1());
//            System.out.println("Nota 2: " + aluno2.getNotas2());
//            System.out.println("Nota 3: " + aluno2.getNotas3());
//            System.out.println("Média: " + aluno2.calculaMedia());
//
//
//        }
        Livro livro = new Livro();
        livro.setTitulo("Narnia");
        livro.setAutor("CS.l");

       livro.exibirDetalhes();

    }
}