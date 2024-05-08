package com.edu.metodos.Smartv;

public class Usuario {
    public static void main(String[] args) {
        //chamando a classe tv
        SmarTv smartv = new SmarTv();

        smartv.diminuirVolume();
        smartv.diminuirVolume();
        smartv.diminuirVolume();
        smartv.aumentarVolume();

        smartv.mudarCanal(13);


        System.out.println("Tv ligada ? " + smartv.ligada);
        System.out.println("Canal atual ? " + smartv.canal);
        System.out.println("Volume atual  ? " + smartv.volume);

        smartv.ligar();
        System.out.println("novo status ,Tv ligada ? " + smartv.ligada);
    }
}
