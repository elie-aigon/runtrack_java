package Jour01.Job10;

import java.util.Scanner;

public class Job10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nom = ");
        String nom = input.next();
        System.out.println("Prenom = ");
        String prenom = input.next();

        System.out.println(prenom+nom);

    }
}
