package Uni6exercicios;

import java.util.Scanner;

public class Uni6Exe03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] vetor = new double[12];

        for (int i = 0; i < 12; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            vetor[i] = teclado.nextDouble();
        }

        for (int i = 0; i < 12; i++) {
            if (i % 2 == 0) {
                vetor[i] *= 1.02;
            } else {
                vetor[i] *= 1.05;
            }
        }

        System.out.println("Vetor atualizado:");
        for (int i = 0; i < 12; i++) {
            System.out.printf("Posição %d: %.2f\n", i, vetor[i]);
        }

        teclado.close();
    }
}


