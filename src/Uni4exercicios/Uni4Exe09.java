package Uni4exercicios;
import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Fale o número 1:");
    int num1 = teclado.nextInt();
    System.out.println("Fale o número 2:");
    int num2 = teclado.nextInt();

    if( num1 % num2 == 0 || num2 % num1 == 0){
        System.out.println("Os números são multiplos");
    }else{
        System.out.println("Os números não são multiplos");
    }
    teclado.close();

    }
}
