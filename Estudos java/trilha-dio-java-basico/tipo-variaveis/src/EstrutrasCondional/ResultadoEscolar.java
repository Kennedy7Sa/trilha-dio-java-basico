// ResultadoEscolar.java
public class ResultadoEscolar {
    public static void main(String[] args) {

//        int nota = 6;
//
//        if(nota >= 7)
//            System.out.println("Aprovado");
//        else if (nota>5 && nota < 7) { //condição sempre tem que retornar true ou false
//            System.out.println("Recuperação");
//        } else
//            System.out.println("Reprovado");

        //para resumir o codigo acima com condição ternaria

        int nota = 6;
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
            }
        }



