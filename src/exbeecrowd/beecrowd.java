package exbeecrowd;

import java.util.Scanner;

public class beecrowd {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int A = 5;
    int B = 6;
    int C = 7;
    int D = 8;

    scanner.close();

    if (B > C && D > A && (C + D) > (A + B) && C >= 0 && D >= 0 && A % 2 == 0) {
        System.out.println("Valores aceitos");
    } else {
        System.out.println("Valores não aceitos");

      }
    }
    }

