package Jour02;

import java.util.Scanner;

public class Job07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre un nombre :");
        int num = input.nextInt();
        int i = 1;
        int result = 1;
        while (i <= num ){
            result *=i;
            i++;
        }
        System.out.println(result);
    }
}
