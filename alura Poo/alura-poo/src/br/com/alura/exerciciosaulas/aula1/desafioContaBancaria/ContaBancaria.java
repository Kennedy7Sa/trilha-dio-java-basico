package br.com.alura.exerciciosaulas.aula1.desafioContaBancaria;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        String  nomeCliente = "Kennedy da Silva Arruda";
        String tipoConta = "Corrente";
        double saldoInicial = 2500;
        int operacao = 0 ;
        String menu = """
                ******************************************
                                Operações 
                1 - Consultar Saldo 
                2 - depositar valor 
                3 - Transferir
                4 - Sair 
                
                       -> Digite a opção desejada <-
                ******************************************
                """;

        System.out.println(String.format("""
                ******************************************
                Nome: %s
                tipo conta : %s 
                Saldo inicial : %.2f
                ******************************************              
                """,nomeCliente,tipoConta,saldoInicial));

        Scanner leitura = new Scanner(System.in);
       // System.out.println(menu);
        //operacao = leitura.nextInt();

        while (operacao !=4){
            System.out.println(menu);
            operacao = leitura.nextInt();
            if (operacao == 1 ){
                System.out.println(String.format("Seu saldo atual é %.2f",saldoInicial));
            } else if (operacao == 2 ) {
                System.out.println("Digite o valor a ser depositado  ");
                double deposito = leitura.nextDouble();
                saldoInicial += deposito;
                System.out.println(String.format("Seu saldo atualizado é %.2f",saldoInicial));


            } else if (operacao ==3  ) {
                System.out.println("Digite o valor a ser transferido  ");
                double transferencia = leitura.nextDouble();
                if (transferencia <= saldoInicial) {
                    saldoInicial -= transferencia;
                    System.out.println(String.format("Seu saldo atualizado é %.2f", saldoInicial));
                }else {
                    System.out.println("Saldo insuficiente");
                }

            }else if(operacao!=4) {
                System.out.println("Opção invalida");
            }

        }
    }
}
