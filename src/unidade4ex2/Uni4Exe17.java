package unidade4ex2;

import java.util.Scanner;

public class Uni4Exe17 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Qual o rendimento anual: ");
    int rendimentoAnual = teclado.nextInt();
    System.out.println("Qual o número de dependentes: ");
    int dependentes = teclado.nextInt();
    double descontoDependentes = rendimentoAnual * (0.02 * dependentes);
    double rendimentoliquido = rendimentoAnual - descontoDependentes;
    double imposto =  0;

    if(rendimentoliquido <= 2000){
     imposto = 0;
     System.out.println("Não paga imposto.");
    }else if(rendimentoliquido > 2000 && rendimentoliquido <= 5000){
     imposto = rendimentoliquido * 0.05;
     System.out.println("O imposto é de 5% " + imposto); 
    }else if(rendimentoliquido >5000 && rendimentoliquido <= 10000){
    imposto = rendimentoliquido * 0.10;
     System.out.println("O impostp é de 10%: " + imposto);
    }else{
    imposto = rendimentoliquido * 0.15;
    System.out.println("O imposto é de 15%: " + imposto);
    }

teclado.close();
}
}
