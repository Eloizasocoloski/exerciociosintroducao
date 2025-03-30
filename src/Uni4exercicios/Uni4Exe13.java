package Uni4exercicios;

import java.util.Scanner;

public class Uni4Exe13 {
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Qual a carta 1: ");
    int Carta1 = teclado.nextInt();
    System.out.println("Qual a carta 2: ");
    int Carta2 = teclado.nextInt();
    System.out.println("Qual a carta 3 ");
    int Carta3 = teclado.nextInt();
    int quntdeBoas = teclado.nextInt();

    if(Carta1 == 1 || Carta1 == 2 || Carta1 == 3){
     quntdeBoas += 1 ;
    }
    if(Carta2 == 1 || Carta2 == 2 || Carta2 ==3){
     quntdeBoas = quntdeBoas + 1 ;
    }
    if(Carta3 == 1 || Carta3 == 2 || Carta3 == 3){
    quntdeBoas = quntdeBoas ++ ; 
    }
    if(quntdeBoas == 1){
        System.out.println("Truco!");
    }else if(quntdeBoas == 2){
        System.out.println("Seis!");
    }else if ((quntdeBoas == 3)) {
        System.out.println("Nove!");
    }else{
        System.out.println("Nenhuma das opçoes");
    }
    teclado.close();
}
}
