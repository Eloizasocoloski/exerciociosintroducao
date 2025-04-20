package Uni5exercicios;

import java.util.Scanner;

public class Uni5Exe09 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("quantas pessoas tem: ");
    int n = teclado.nextInt();
    int quantidadePessoasMais20 = 0;


    for( int i = 1; i <= n; i++){

        System.out.println("Qual a sua idade: ");
        int idade = teclado.nextInt();

        System.out.println("Qual o seu nome: ");
        String nome = teclado.next();

        if(idade == 18){
            System.out.println("Nome dos alunos que tem 18 anos: "+ nome);
        }
        if(idade >= 20){
            quantidadePessoasMais20++;
        }

    }
    System.out.println("A quantidade de pessoas que mais de 20 anos é: "+ quantidadePessoasMais20);

}
}
