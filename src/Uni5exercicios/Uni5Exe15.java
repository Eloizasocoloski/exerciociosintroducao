package Uni5exercicios;

import java.util.Scanner;

public class Uni5Exe15 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Qual o seu nome: ");
    System.out.println("Se não quiser mais escreva fim no nome.");

    String nome = teclado.next();

    while (!nome.equals("fim")){

    System.out.println("Qual a nota 1:");
    int nota1 = teclado.nextInt();

    System.out.println("Qual a nota 2:");
    int nota2 = teclado.nextInt();

    double media = (nota1 + nota2) / 2;

    System.out.println("A média de "+ nome + " é:"+ media);

    System.out.println("Qual o seu nome: ");
    System.out.println("Se não quiser mais escreva fim no nome.");

    nome = teclado.next();

    }
    System.out.println("nome: fim");
    teclado.close();
    }
}
