package Job2;

import java.util.HashSet;

public class HashSetArgumentExercice {
    public static void main(String[] args) {
        HashSet<String> a = new HashSet<>();
        for(String i : args) {
            if (!a.contains(i)) {
                a.add(i);
                System.out.println(i);
            }
        }
    }
}
