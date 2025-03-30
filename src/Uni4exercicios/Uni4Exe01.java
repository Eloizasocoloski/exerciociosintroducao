package Uni4exercicios;

import java.util.Scanner;

public class Uni4Exe01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com a horas trabalhadas: ");
        int horasMes = teclado.nextInt();
        System.out.println("Entre com o valor pago por hora: ");
        int horasValor = teclado.nextInt();
        int salarioExtra = teclado.nextInt();
        int horasnormais = 160;

        int salarioTotal = horasMes * horasValor;

        if (horasMes > horasnormais ){
            salarioExtra = (horasMes - 160)  * (horasValor / 2) ;
        }else{
            salarioTotal = salarioTotal + salarioExtra;
        }

        System.out.println("o salario total é: " + salarioTotal);

        System.out.println("Fim da aplicação!");
        teclado.close();


    }

}