package desafio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite um valor entre 3 e 999: ");
        int numero = scan.nextInt();


       for (int i=3; i<=numero; i++){
           for (int j=3; j<=i; j++)
               if (i % j == 0) {
                   if (i % 2 !=  0) {
                       System.out.println(i);
                   }

               }
       }
    }
}
