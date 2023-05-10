package Jour02;

import java.util.Scanner;

public class Job05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tappe ton age : ");
        int age = input.nextInt();
        if(age < 16){
            System.out.println("Trop jeune");
        } else if (age >= 67) {
            System.out.println("Bonne retraite");
        } else {
            System.out.println("Bonne chance por trouver du boulot");
        }

    }

}
