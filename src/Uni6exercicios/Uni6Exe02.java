package Uni6exercicios;

import java.util.Scanner;

public class Uni6Exe02 { 

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] vetor = new double[12];
        double soma = 0;

        for (int i = 0; i < 12; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            vetor[i] = teclado.nextDouble();
            soma += vetor[i];
        }

        double media = soma / 12;
        System.out.printf("Média dos valores: %.2f\n", media);

        System.out.println("Valores maiores que a média:");
        for (int i = 0; i < 12; i++) {
            if (vetor[i] > media) {
            System.out.println(vetor[i]);
            }
        }

        teclado.close();
    }
    }
