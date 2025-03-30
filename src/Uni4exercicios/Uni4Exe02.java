package Uni4exercicios;

import java.util.Scanner;

public class Uni4Exe02 {
    public static void main (String[] args ){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Escreva um numero inteiro maior que 0 = ");
    int numeroInteiro = teclado.nextInt();
    if(numeroInteiro % 2 ==0){
        System.out.println("O número é par!");
    }else{
        System.out.println("o número é impar!");
    }
    teclado.close();
    System.out.println("fim da aplicação");
}
}