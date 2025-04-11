package Uni5exercicios;

import java.util.Scanner;

public class Uni5Exe01 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    for (int i = 1; i <=20; i++ ){

        System.out.println("Fale número inteiro");
        int num = teclado.nextInt();

        if(num % 2 == 0){
            System.out.println("O número é par");
        }else{
            System.out.println("O número é impar");
        }
    }
    teclado.close();
    }

}
