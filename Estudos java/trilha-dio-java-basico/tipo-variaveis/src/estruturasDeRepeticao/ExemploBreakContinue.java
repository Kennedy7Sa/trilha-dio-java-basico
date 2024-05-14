package estruturasDeRepeticao;

public class ExemploBreakContinue {
    public static void main(String[] args) {

        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
              //  break;// nessa caso sera impresso apenas 1,2
            continue; // se tirarmos o break colacando o continue ele vai pular o 3 e continuar
            System.out.println(numero);

        }
        //Qual a saída no console ?

    }
}
