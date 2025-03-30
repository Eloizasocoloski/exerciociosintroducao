package unidade4ex2;

import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Qual a sua altura: ");
    double altura = teclado.nextDouble();
    System.out.println("Qual a sua massa: ");
    double massa = teclado.nextDouble();
    double IMC = massa / (altura * altura);

    if(IMC < 18.5){
        System.out.println("Magreza.");
    }else if( IMC < 24.9){
        System.out.println("Saúdavel.");
    }else if( IMC < 29.9){
        System.out.println("Sobrepeso");
    }else if(IMC < 34.9){
        System.out.println("Obesidade grau |");
    }else if( IMC < 39.9 ){
        System.out.println("Obesidade grau || (grave)");
    }else{
        System.out.println("Obesidade grau |||(mórbida)");
    }
    teclado.close();
    }
}
