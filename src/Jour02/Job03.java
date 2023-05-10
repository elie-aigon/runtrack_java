package Jour02;

import java.util.Scanner;

public class Job03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez chiffre :");
        int num = input.nextInt();
        for (int i = 1; i <=10; i++){
            int result = num * i;
            System.out.println(num + " * " + i + " = " + result);
        }
    }
}
