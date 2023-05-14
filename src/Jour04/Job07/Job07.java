package Jour04.Job07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Job07 {
    public static void main(String[] args) {
        final int nThreads = 2;
        System.out.println("Combien de nombre voulez-vous additionner?");
        Scanner input  = new Scanner(System.in);
        int listLen = input.nextInt();
        int[] numberList = new int[listLen];
        for (int i = 0; i<listLen; i++){
            System.out.print("num " + (i+1) + " : ");
            Scanner inputList = new Scanner(System.in);
            numberList[i] = inputList.nextInt();
        }
        int[] numbers1 = Arrays.copyOfRange(numberList, 0, listLen / 2);
        int[] numbers2 = Arrays.copyOfRange(numberList, listLen/2, listLen);

        Sum T1 = new Sum(numbers1);
        Sum T2 = new Sum(numbers2);
        long start = System.nanoTime();
        T1.start();
        T2.start();

        try {
            T1.join();
            T2.join();
        } catch (InterruptedException e) {
            System.out.println("BLYAT JOIN");
        }
        long total = T1.getter() + T2.getter();
        double delta = System.nanoTime() -start;
        System.out.println("Result = " + total + " en " + delta/1000000 + " ms");
    }
}
