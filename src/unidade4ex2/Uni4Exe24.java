package unidade4ex2;

 
import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite os três valores:");
        
        int valor1 = teclado.nextInt();
        int valor2 = teclado.nextInt();
        int valor3 = teclado.nextInt();
        
        // Ordenação valores ___
        int valorMenor, valorMedio, valorMaior;
        
        if (valor1 <= valor2 && valor1 <= valor3) {
            valorMenor = valor1;
            if (valor2 <= valor3) {
                valorMedio = valor2;
                valorMaior = valor3;
            } else {
                valorMedio = valor3;
                valorMaior = valor2;
            }
        } else if (valor2 <= valor1 && valor2 <= valor3) {
            valorMenor = valor2;
            if (valor1 <= valor3) {
                valorMedio = valor1;
                valorMaior = valor3;
            } else {
                valorMedio = valor3;
                valorMaior = valor1;
            }
        } else {
            valorMenor = valor3;
            if (valor1 <= valor2) {
                valorMedio = valor1;
                valorMaior = valor2;
            } else {
                valorMedio = valor2;
                valorMaior = valor1;
            }
        }

        System.out.println("Menu:");
        System.out.println("1: Ordem crescente");
        System.out.println("2: Ordem decrescente");
        System.out.println("3: Maior ao meio");
        int opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Valor menor: " + valorMenor);
                System.out.println("Valor medio: " + valorMedio);
                System.out.println("Valor alto: " + valorMaior);
                break;
            case 2:
                System.out.println("Valor alto: " + valorMaior);
                System.out.println("Valor medio: " + valorMedio);
                System.out.println("Valor menor: " + valorMenor);
                break;
            case 3:
            System.out.println("Valor medio: " + valorMedio);
            System.out.println("Valor alto: " + valorMaior);
            System.out.println("Valor menor: " + valorMenor);
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }
        teclado.close();
    }
}
//Dados 3 valores, escreva um algoritmo que os informa em uma determinada ordem a partir de um menu de opções:
//se opção = 1, escreva os 3 valores em ordem crescente
//se opção = 2, escreva os 3 valores em ordem decrescente
//se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio

//Exemplos de entrada	Exemplos de saída
//Valor 1: 5 Valor 2: 3 Valor 3: 2 Opção: 1	2 3 5
//Valor 1: 5 Valor 2: 3 Valor 3: 2 Opção: 2	5 3 2
//Valor 1: 5 Valor 2: 3 Valor 3: 2 Opção: 3	3 5 2