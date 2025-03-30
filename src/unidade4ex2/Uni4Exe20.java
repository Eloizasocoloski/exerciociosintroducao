package unidade4ex2;

import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Qual é a nota 1: ");
    double notaProva1 = teclado.nextDouble();
    System.out.println("Qual é a nota 2: ");
    double notaProva2 = teclado.nextDouble();
    System.out.println("Qual é a nota 3: ");
    double notaProva3 = teclado.nextDouble();
    System.out.println("Qual a nota de exercicios: ");
    double notaExercicios = teclado.nextDouble();
    double media = (notaProva1 + notaProva2 * 2 + notaProva3 * 3 + notaExercicios) / 7;
    if(media >= 9){
        System.out.println(" A média de aproveitamento foi: " + media + " e o conceito foi A. Aprovado.");
    }else if( media>= 7.5 || media < 9 ){
        System.out.println("A média de aproveitamento foi : " + media + " e o conceito foi B.Aprovado.");
    }else if(media >= 6.0|| media < 7){
        System.out.println("A média de aproveitamento foi : " + media + " e o conceito foi C.Aprovado.");
    }else if(media >= 4 || media < 6.0){
        System.out.println("A média de aproveitamento foi : " + media + " e o conceito foi D.Reprovado.");
    }else{
        System.out.println("A média de aproveitamento foi : " + media + " e o conceito foi E.Reprovado.");
    }
    teclado.close();
    }
}
