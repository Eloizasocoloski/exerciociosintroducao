package Uni6exercicios;

import java.util.Scanner;

public class Uni6Exe08 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int N;
        do {
            System.out.print("Digite a quantidade de valores (até 20): ");
            N = teclado.nextInt();
        } while (N < 1 || N > 20);

        double[] vetor = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Digite 6 valores: ");
            vetor[i] = teclado.nextDouble();
        }

        System.out.println("\nValor\tQuantidade");
        for (int i = 0; i < N; i++) {
            boolean jaContado = false;

            for (int j = 0; j < i; j++) {
                if (vetor[i] == vetor[j]) {
                    jaContado = true;
                    break;
                }
            }

            if (!jaContado) {
                int cont = 1;
                for (int k = i + 1; k < N; k++) {
                    if (vetor[i] == vetor[k]) {
                        cont++;
                    }
                }
                System.out.println(vetor[i] + "\t" + cont);
            }
        }

        teclado.close();
    }
}
