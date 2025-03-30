package Uni4exercicios;

import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Entre com o peso da carta: ");
    double PesoCarta = teclado.nextDouble();

    double ValorPagar = 0;

    if(PesoCarta <= 50){
       ValorPagar = 0.45;
    }else{
    double PesoExcedido = PesoCarta - 50;
    double quantidadeAdicional = (PesoExcedido / 20) +1;
    ValorPagar = 0.45f + 0.45f* quantidadeAdicional;
    }

    
    System.out.println("Custo do selo = " + ValorPagar);
    teclado.close();
    System.out.println("fim da aplicaçao");

}
}