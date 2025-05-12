package Uni6exercicios;

import java.util.Scanner;

public class Uni6Exe04 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int[] vetor1 = new int[10];
    int[] vetor2 = new int[10];
    int[] vetor3 = new int[10];

    for(int i = 0; i <10; i++){
        System.out.println("Digite 10 valores para o vetor1: ");
        vetor1[i] = teclado.nextInt();
    }

    for(int i = 0; i<10; i++){
        System.out.println("Digite 10 valores para o vetor2");
        vetor2[i] =  teclado.nextInt();
    }

    for(int i = 0; i<10; i++){
        vetor3[i] = vetor1[i] + vetor2[i];
        System.out.println("{"+vetor1[i]+","+vetor2[i]+","+vetor3[i]+"}");
    
        }
        teclado.close();
}
}
