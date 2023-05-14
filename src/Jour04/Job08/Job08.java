package Jour04.Job08;

import java.util.ArrayList;
import java.util.Scanner;

public class Job08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Combien de Thread ?");
        int nbThreads = input.nextInt();
        long fraction = 1000000 / nbThreads;
        ArrayList<MyThread> ThreadList = new ArrayList<>();
        for (int i = 0; i < nbThreads; i++) {
            MyThread thread = new MyThread(fraction);
            ThreadList.add(thread);
        }
        long result = 0;
        long start = System.nanoTime();
        for (MyThread t : ThreadList) {
            t.start();
        }
        try {
            for (MyThread t : ThreadList) {
                t.join();
                result += t.getter();
            }
            double delta = System.nanoTime() - start;
            System.out.println("Result = " + result + " in " + delta /1000000 + " ms ");
        }catch (InterruptedException e) {
            System.out.println("BLYAT JOIN");
        }
    }
}
