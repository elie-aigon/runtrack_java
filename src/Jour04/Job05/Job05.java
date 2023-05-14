package Jour04.Job05;

import java.util.ArrayList;
import java.util.Scanner;

public class Job05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long finisher = input.nextLong();
        ComptThread T1 = new ComptThread();
        ComptThread T2 = new ComptThread();
        long result = 0;
        long start = System.nanoTime();
        result += T1.run(0, finisher/2);
        result += T2.run(0, finisher/2);
        double delta = System.nanoTime() - start;
        System.out.println(result + " en : " + delta/1000000 + " ms");
    }
}
