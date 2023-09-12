package Job3;

import java.util.HashMap;
public class HashMapArgumentExercice {
    public static void main(String[] args) {
        HashMap<String, String> a = new HashMap<>();
        for(int i = 0; i<args.length; i+=2) {
            a.put(args[i], args[i+1]);
            System.out.println(a);
        }
    }
}
