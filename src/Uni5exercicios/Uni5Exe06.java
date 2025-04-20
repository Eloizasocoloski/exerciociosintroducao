package Uni5exercicios;

import java.util.Scanner;

public class Uni5Exe06 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    double SomaAlturas = 0.0;
    double quantidadePessoas = 20;


    for(int  i = 1; i <= quantidadePessoas; i++){
        System.out.println("Qual a sua altura: ");
        double altura = teclado.nextDouble();
        SomaAlturas += altura;

    }

    double mediaAlturas = SomaAlturas / quantidadePessoas;
    System.out.println("A media da altura das meninas é:"+mediaAlturas);
    teclado.close();
}
}