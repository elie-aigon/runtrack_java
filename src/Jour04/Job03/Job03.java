package Jour04.Job03;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Job03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long len = input.nextLong();
        String finalString = "";
        ArrayList<StringThread> ThreadList = new ArrayList<>();
        long start = System.nanoTime();
        for (int i = 0; i < 2 ; i++){
            StringThread CurrentThread = new StringThread();
            ThreadList.add(CurrentThread);
            CurrentThread.run(len/2);
        }
        for (StringThread thread : ThreadList) {
             finalString += thread.getString();
        }
         try {
             FileWriter writer = new FileWriter("output.txt");
             writer.write(finalString);
             writer.close();
             double delta = System.nanoTime() - start;
             System.out.println("Le fichier a été créer + écrit en : " + delta/1000000 + " ms.");
             } catch (IOException e){
             System.out.println("blyat writer");
         }
    }
}
