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
    Carro meuCarro = new Carro();
        meuCarro.modelo = "Fox ";
        meuCarro.ano = 2010;
        meuCarro.cor = "Cinza";

        meuCarro.fichaTecnica();

        System.out.println("idade do meu carro " + meuCarro.calculaIdade());

    }

}
