package screenmatchPOO.exercicios;

public class Carro {
   String modelo;
   int ano;
   String cor ;

   void fichaTecnica() {
       System.out.println(String.format("""
               Modelo: %s
               Ano: %d
               Cor: %s
                              
               """, modelo, ano, cor));
   }
       int calculaIdade(){
         return 2024 - ano;
       }
   }

