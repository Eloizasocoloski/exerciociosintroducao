package Uni4exercicios;

import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    System.out.println("A cor é azul? informe sim[true] ou nao[false]");
    boolean Resposta = teclado.nextBoolean();
    if(Resposta){
        System.out.println("Sim");
    }else{
        System.out.println("Não");
    }
    teclado.close();
    System.out.println("fim da aplicação");
}
}

