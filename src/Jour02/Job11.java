package Jour02;

import java.util.Scanner;

public class Job11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String result = "";
        for (int i = 1; i <= num; i++){
            result += "*";
            System.out.println(result);
        }
    }
}
