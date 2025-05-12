package Uni6exercicios;

import java.util.Scanner;

public class Uni6Exe01 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);


    int[] vetorinteiros = new int[10];
    
    System.out.println("informe 10 números inteiros");

    for(int i = 0; i < vetorinteiros.length; i++){
        System.out.print("Número " + (i + 1) + ": ");
        vetorinteiros [i] = teclado.nextInt();
    }

    int i = 0;
        int j = vetorinteiros.length - 1;

        while (i < j) {
            int temp = vetorinteiros[i];
            vetorinteiros[i] = vetorinteiros[j];
            vetorinteiros[j] = temp;

            i++;
            j--;
        }

        for (int k = 0; k < vetorinteiros.length; k++) {
            System.out.print(vetorinteiros[k] + " ");
        }
        teclado.close();
    }
}

    
    

