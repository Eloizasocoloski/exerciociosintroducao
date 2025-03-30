package unidade4ex2;

import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Qual a idade do primeiro irmão: ");
    int irmao1 = teclado.nextInt();
    System.out.println("Qual a idade do segundo irmão: ");
    int irmao2 = teclado.nextInt();
    System.out.println("Qual a idade do terceiro irmão: ");
    int irmao3 = teclado.nextInt();
    
    if (irmao1 == irmao2 && irmao2 == irmao3) {
     System.out.println("São irmão Trigêmeos!");
    } else if (irmao1 == irmao2 || irmao2 == irmao3 || irmao1 == irmao3) {
     System.out.println("São gêmeos!");
    }else{
     System.out.println("Apenas irmãos");
    }
    teclado.close();
    }
}
