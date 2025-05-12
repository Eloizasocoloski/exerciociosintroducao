package Uni5exercicios;

import java.util.Scanner;

public class Uni5Exe17 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int somaAlturas = 0;
    int totalAtletas = 0;
    int alturaMaisAlta = 0;
    int alturaMaisBaixa = 0;
    int inscricaoMaisBaixo = 0;
    int inscricaoMaisAlto = 0;

    System.out.println("Digite o seu número de inscrição ou 0 para sair");
    int numeroInscricao = teclado.nextInt();

    while (numeroInscricao != 0) {

    System.out.println("Digite a sua altura: ");
    double altura = teclado.nextDouble();

    somaAlturas += altura;
    totalAtletas++;

    if (altura > alturaMaisAlta) {
        alturaMaisAlta += altura;
        inscricaoMaisAlto = numeroInscricao;
    }

    if (altura < alturaMaisBaixa) {
        alturaMaisBaixa += altura;
        inscricaoMaisBaixo =  numeroInscricao;
    }

    double mediaAlturas  =  somaAlturas / totalAtletas;
    System.out.println("O altura do atleta mais baixo é: "+alturaMaisBaixa + " e o numero de incricao é :" + inscricaoMaisBaixo);
    System.out.println("O altura do atleta mais alto é: "+alturaMaisAlta + " e o numero de incricao é :" + inscricaoMaisAlto);
    System.out.println("A media dos atletas é: "+mediaAlturas);
    }
}
}
