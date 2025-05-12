package Uni6exercicios;

import java.util.Scanner;

public class Uni6Exe05 {

    public static void main(String[] args) {
    Scanner teclado =  new Scanner(System.in);

    String[] respostamenina = new String[5];
    String[] respostamenino = new String[5];
    String  resultado;

    String[] perguntas = {
            "Gosta de música sertaneja?",
            "Gosta de futebol?",
            "Gosta de seriados?",
            "Gosta de redes sociais?",
            "Gosta da Oktoberfest?"
        };

        System.out.println("Respostas do RAPAZ:");
        for (int i = 0; i < perguntas.length; i++) {
            String resposta;
            do {
                System.out.print(perguntas[i] + " (SIM / NAO / IND): ");
                resposta = teclado.nextLine().trim().toUpperCase();
            } while (!resposta.equals("SIM") && !resposta.equals("NAO") && !resposta.equals("IND"));
            respostamenino[i] = resposta;
        }

        System.out.println("\nRespostas da MOÇA:");
        for (int i = 0; i < perguntas.length; i++) {
            String resposta;
            do {
                System.out.print(perguntas[i] + " (SIM / NAO / IND): ");
                resposta = teclado.nextLine().trim().toUpperCase();
            } while (!resposta.equals("SIM") && !resposta.equals("NAO") && !resposta.equals("IND"));
            respostamenina[i] = resposta;
        }

        int indice = 0;
        for (int i = 0; i < 5; i++) {
            if (respostamenino[i].equals(respostamenina[i])) {
                indice += 3;
            } else if (respostamenino[i].equals("IND") || respostamenino[i].equals("IND")) {
                indice += 1;
            } else {
                indice -= 2;
            }
        }

        System.out.println("\nÍndice de afinidade: " + indice);

        if (indice == 15) {
            System.out.println("Casem!");
        } else if (indice >= 10) {
            System.out.println("Talvez não dá certo.");
        } else if (indice >= 5) {
            System.out.println("Vale um encontro.");
        } else if (indice >= 0) {
            System.out.println("Melhor não perder tempo");
        } else {
            System.out.println("Vocês se odeiam!");
        }

        teclado.close();
    }
}




    

