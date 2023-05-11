package Jour03.Job06;

import java.util.Arrays;
import java.util.Random;

public class Job06 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] tab = new int[10];
        for (int i = 0; i < tab.length; i++){
            tab[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(tab));
    }
}
