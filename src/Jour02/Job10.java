package Jour02;

import java.util.Scanner;

public class Job10 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Tapper un nombre :");
        int num = input.nextInt();
        int somme = 0;
        while (num > 0){
            int i = num % 10;
            somme += i;
            num /=10;
        }
        System.out.println("Resutat = " + somme);

    }
}
