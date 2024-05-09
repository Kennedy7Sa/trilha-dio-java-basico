package screenmatchv1;

public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1986;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        // usando if(se) e else (se não )

        if (anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo");
        }else {

            System.out.println("Filme retro que vale a pena assistir!");
        }

        // mais de uma condição
        //para comparar String use o equals

        if (incluidoNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("Filme liberado ");
        }else {
            System.out.println("Deve pagar a locação ");
        }


    }
}
