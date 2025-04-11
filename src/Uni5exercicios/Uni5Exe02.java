package Uni5exercicios;

import java.util.Scanner;

public class Uni5Exe02 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int somapares = 0;
    int somaimpares = 0;

    for(int i = 1; i <= 100;i++){

        if( i % 2 == 0){
             somapares += i;
        }else{
             somaimpares += i;
        }
        System.out.println("A soma dos pares é :" + somapares);
        System.out.println("A soma dos impares é: "+ somaimpares);
    }
    teclado.close();
    }
}
