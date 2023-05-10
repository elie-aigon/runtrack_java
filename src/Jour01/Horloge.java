package Jour01.Job11;

import java.util.Scanner;

public class Horloge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = input.nextInt();
        int heure = min/60;
        min = min - (heure * 60);
        System.out.println( heure + ":"+ min);
    }
}
