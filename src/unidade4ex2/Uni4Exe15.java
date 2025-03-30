package unidade4ex2;

import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Quantos meses faz que você foi adimitido: ");
    int meses = teclado.nextInt();

    if( meses  <= 12){
        System.out.println("O funcionário receberá 5% de reajuste!");
    }else if(meses > 13 || meses  < 48){
        System.out.println("O funcionário receberá 7% de reajuste!");
    }else{
        System.out.println("Reajuste não informado!");
    }
    teclado.close();
    }
}
