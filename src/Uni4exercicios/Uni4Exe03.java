package Uni4exercicios;

import java.util.Scanner;

public class Uni4Exe03 {
    public static void main (String[] args ){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Fale o numero 1:");
    int num1 = teclado.nextInt();
    System.out.println("Fale o numero 2:");
    int num2 = teclado.nextInt();
    if(num1 > num2){
        System.out.println("O número "  + num1  + " é maior que " + num2 );
    }else{
        System.out.println("O número"  + num2  + " é maior que" + num1 ); 
    }
    teclado.close();
    System.out.println("Fim da aplicação");
}
}