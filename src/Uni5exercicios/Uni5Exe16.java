package Uni5exercicios;

import java.util.Scanner;

public class Uni5Exe16 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int quantidadeDePessoas = 0;
        double somaAlturatotal = 0;
        double somaAlturafeminino = 0;
        int quantidefeminino = 0;

        System.out.println("digite sua altura ou 0 para sair");
        double altura = teclado.nextDouble();

        while (altura != 0) {

            System.out.println("Qual o seu gênero, digite  M para masculino, F para feminino e O para outro");
            String genero = teclado.next();

            somaAlturatotal += altura;
            quantidadeDePessoas++;

            if (genero.equals("F")) {
                somaAlturafeminino += altura;
                quantidefeminino++;
            }

            System.out.println("digite sua altura ou 0 para sair");
            altura = teclado.nextDouble();
        }

        double mediafeminino = somaAlturafeminino / quantidefeminino;
        double mediatotal = somaAlturatotal / quantidadeDePessoas;

        System.out.println(" A media da altura das mulheres é:  " + mediafeminino);
        System.out.println("A média do total do grupo é:  " + mediatotal);

    }

}
