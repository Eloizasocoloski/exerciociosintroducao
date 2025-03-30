package unidade4ex2;

import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Informe uma letra: ");
    char letra = teclado.next().toUpperCase().charAt(0);
    if(letra == 'A'
    || letra == 'E' 
    || letra == 'I' 
    || letra == 'O'
    || letra == 'U'){
    System.out.println("A letra é uma vogal!");
    }else{
    System.out.println("A letra não é uma vogal!");
}

    teclado.close();
}
}
