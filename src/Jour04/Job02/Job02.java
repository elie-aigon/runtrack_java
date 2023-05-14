package Jour04.Job02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Job02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        long start = System.nanoTime();
        try {
            FileWriter filewriter = new FileWriter("output.txt", true);
            System.out.println("Fichier créer");
            filewriter.write(GenString(len));
            filewriter.close();
        } catch (IOException e) {
            System.out.println("Error blyat 1");
        }
        double delta = (System.nanoTime() - start);
        System.out.println("durée d'exec : " + delta / 1000000 + "milli secondes");
    }
    public static String GenString (int len){
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            sb.append('a');
        }
        return sb.toString();
    }

}
