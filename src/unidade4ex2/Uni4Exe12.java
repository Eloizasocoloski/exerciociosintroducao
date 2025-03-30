package unidade4ex2;

import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Qual o valor do lado 1:");
    int lado1 = teclado.nextInt();
    System.out.println("Qual o valor do lado 2:");
    int lado2 = teclado.nextInt();
    System.out.println("Qual o valor do lado 3: ");
    int lado3 = teclado.nextInt();
    if(lado1<(lado2+lado3) && lado2 <(lado1+lado3) && lado3 <(lado1+lado2)){
        System.out.println("Não Formam um triângulo!");
    }else if(lado1 == lado2 && lado1 == lado3){
        System.out.println("É um equilatrelo!");
    }else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
        System.out.println("É isosceles!");
    }else{
        System.out.println("É escaleno!");
    }
    teclado.close();
}
}
