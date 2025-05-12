package Uni6exercicios;

import java.util.Scanner;

public class Uni6Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] notas = new int[5];
        int[] idades = new int[5];
        int[] sexos = new int[5]; 

        int somaNotas = 0;
        int somaNotasHomens = 0;
        int contHomens = 0;
        int idadeMulherMaisJovem = Integer.MAX_VALUE;
        int notaMulherMaisJovem = -1;

        for (int i = 0; i < 5; i++) {
            System.out.println("\nCliente " + (i + 1));

            System.out.print("Digite sua idade: ");
            idades[i] = teclado.nextInt();

            System.out.print("Digite o seu sexo (1 = feminino, 2 = masculino): ");
            sexos[i] = teclado.nextInt();

            System.out.print("Digite uma nota para o cinema (0 a 10): ");
            notas[i] = teclado.nextInt();

            somaNotas += notas[i];

            if (sexos[i] == 2) {
                somaNotasHomens += notas[i];
                contHomens++;
            }

            if (sexos[i] == 1 && idades[i] < idadeMulherMaisJovem) {
                idadeMulherMaisJovem = idades[i];
                notaMulherMaisJovem = notas[i];
            }
        }
        double mediaGeral = (double) somaNotas / 5;
        double mediaHomens = contHomens > 0 ? (double) somaNotasHomens / contHomens : 0;

        int mulheresMais50NotaAcimaMedia = 0;
        for (int i = 0; i < 5; i++) {
            if (sexos[i] == 1 && idades[i] > 50 && notas[i] > mediaGeral) {
                mulheresMais50NotaAcimaMedia++;
            }
        }

        System.out.printf("\nNota média do cinema: %.2f%n", mediaGeral);
        System.out.printf("Nota média atribuída pelos homens: %.2f%n", mediaHomens);
        System.out.println("Nota atribuída pela mulher mais jovem: " + notaMulherMaisJovem);
        System.out.println("Quantidade de mulheres com mais de 50 anos e nota acima da média: " + mulheresMais50NotaAcimaMedia);

        teclado.close();
    }
}
  

    

