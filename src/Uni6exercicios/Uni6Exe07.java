package Uni6exercicios;

import java.util.Scanner;

public class Uni6Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N;

        do {
            System.out.print("Digite o tamanho do vetor (1 a 20): ");
            N = teclado.nextInt();
        } while (N < 1 || N > 20);

        int[] vetor = new int[N];
        int contador = 0;

        while (contador < N) {
            System.out.print("Digite um número inteiro: ");
            int numero = teclado.nextInt();

            boolean repetido = false;
            for (int i = 0; i < contador; i++) {
                if (vetor[i] == numero) {
                    repetido = true;
                    break;
                }
            }

            if (repetido) {
                System.out.println("Número já existe. Digite outro.");
            } else {
                vetor[contador] = numero;
                contador++;
            }
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        System.out.println("\n Vetor ordenado:");
        for (int i = 0; i < N; i++) {
            System.out.print("[" + vetor[i] + "]");
        }
        System.out.println();
            teclado.close();
    }
}
