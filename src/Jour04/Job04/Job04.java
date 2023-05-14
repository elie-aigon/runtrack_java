package Jour04.Job04;

import java.util.Scanner;

public class Job04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long max = input.nextLong();
        int i = 0;
        long start = System.nanoTime();
        while (i < max){
            i++;
        }
        double delta = (System.nanoTime() - start);
        System.out.println("le comtpe est de : " + i + " et t = " + delta/1000000 + " ms");
    }
}
