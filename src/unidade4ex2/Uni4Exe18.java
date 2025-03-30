package unidade4ex2;

import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Qual é o valor da prestação: ");
    double valorPrestação = teclado.nextDouble();
    System.out.println("Qual o dia do pagamento: ");
    double diaPagamento = teclado.nextDouble();
    double vencimentoPagamento = 10 ;
    double pagamento = 0;

    if(diaPagamento < vencimentoPagamento){
        pagamento = valorPrestação - (diaPagamento * 0.02);
        System.out.println("O pagamento está em dia.O valor da pretação é: " + pagamento);
    }else{
        pagamento = valorPrestação * (diaPagamento * 0.02);
        System.out.println("O pagamento está em atraso.Multa de 2% por cada dia de atraso. O valor da prestação é: "+ pagamento);

        teclado.close();
    }
    }
}
