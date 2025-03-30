package unidade4ex2;

import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Qual a idade da mulher 1:");
    int mulher1 = teclado.nextInt();
    System.out.println("Qual a idade da mulher 2:");
    int mulher2= teclado.nextInt();
    System.out.println("Qual a idade do homem 1:");
    int homem1 = teclado.nextInt();
    System.out.println("Qual a idade do homem 2:");
    int homem2 = teclado.nextInt();
    int mulhermaisNova = 0;
    int mulhermaisVelha = 0;
    int homemMaisNovo = 0;
    int homemMaisVelho = 0;

    if(mulher1 > mulher2){
        mulhermaisNova = mulher2;
        mulhermaisVelha = mulher1;
    }else{
        mulhermaisNova = mulher1;
        mulhermaisVelha = mulher2;
    }
    if(homem1 > homem2){
        homemMaisNovo = homem2;
        homemMaisVelho = homem1;
    }else{
        homemMaisNovo = homem1;
        homemMaisVelho = homem2;
    }
    int soma = homemMaisVelho + mulhermaisNova;
    int produto = homemMaisNovo * mulhermaisVelha;
    System.out.println("A soma é: " + soma + " e o produto é: " + produto);
     teclado.close();
    }
}