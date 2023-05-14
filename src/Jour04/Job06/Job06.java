package Jour04.Job06;

import java.util.ArrayList;
import java.util.Scanner;

public class Job06 {
    public static void main(String[] args) {
        System.out.println("Combien de nombre voulez-vous additionner?");
        Scanner input  = new Scanner(System.in);
        int listLen = input.nextInt();

        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i<listLen; i++){
           System.out.print("num " + (i+1) + " : ");
           Scanner inputList = new Scanner(System.in);
           numberList.add(inputList.nextInt());
        }
        long result = 0;
        long start = System.nanoTime();
        for(int value : numberList){
            result+= value;
        }
        double delta = System.nanoTime() - start;
        System.out.println("Resultat = " + result + " en " + delta/1000000 + " ms");
    }
}
