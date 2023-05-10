package Jour02;

import java.util.Scanner;

public class Job09 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Tapper un nombre :");
        String numero = input.next();
        System.out.println("Le premier chiffre est : " + numero.charAt(0) + " ; le dernier char est : " + numero.charAt(numero.length() - 1));
    }
}
