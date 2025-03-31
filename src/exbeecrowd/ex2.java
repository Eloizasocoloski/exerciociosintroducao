package exbeecrowd;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Fale o número inteiro 1, 2 e 3: ");

    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    if (a <= b && a <= c) {
        if (b <= c) {
            System.out.println(a + "\n" + b + "\n" + c);
        } else {
            System.out.println(a + "\n" + c + "\n" + b);
        }
    } else if (b <= a && b <= c) {
        if (a <= c) {
            System.out.println(b + "\n" + a + "\n" + c);
        } else {
            System.out.println(b + "\n" + c + "\n" + a);
        }
    } else {
        if (a <= b) {
            System.out.println(c + "\n" + a + "\n" + b);
        } else {
            System.out.println(c + "\n" + b + "\n" + a);
        }
    }
    
    System.out.println();
    System.out.println(a + "\n" + b + "\n" + c);
    
    scanner.close();
}
}





