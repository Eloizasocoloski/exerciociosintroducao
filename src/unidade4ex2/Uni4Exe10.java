package unidade4ex2;

import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Qual a idade de Marquinhos: ");
    int idadeMarquinhos = teclado.nextInt();
    System.out.println("Qual a idade de Zezinho");
    int idadeZezinho = teclado.nextInt();
    System.out.println("Qual a idade de Luluzinha");
    int idadeLuluzinha = teclado.nextInt();

    if(idadeMarquinhos > idadeZezinho || idadeMarquinhos > idadeLuluzinha){
        System.out.println("Marquinhos é o irmão mais velho! ");
    }else if(idadeZezinho > idadeMarquinhos || idadeZezinho > idadeLuluzinha){
        System.out.println("Zezinho é o irmão mais velho!");
    }else{
        System.out.println("Luluzinha é a irmã mais velha!");
    }
    teclado.close();
    }
}
