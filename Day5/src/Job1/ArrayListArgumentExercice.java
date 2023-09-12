package Job1;

import java.util.ArrayList;

public class ArrayListArgumentExercice {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
         for(String i : args) {
            a.add(i);
            System.out.println(i);
        }
    }
}
