package Uni4exercicios;

import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Escreva uma letra entre (M, F , I): ");
    char entrada = teclado.next().toUpperCase().charAt(0);

    if(entrada == 'F'){
    System.out.println("O gênero é feminino");
    }else if (entrada == 'M'){
    System.out.println("O gênero é masculino");
    }else if (entrada == 'I'){
    System.out.println("Gênero não informado");
    }else{
    System.out.println("Entrada incorreta");
    }

    teclado.close();
}

}

