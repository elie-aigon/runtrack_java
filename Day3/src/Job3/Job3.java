package Job3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Job3 {
    public static void main(String[] args) {
        Map<Integer, String> a = new HashMap<>();
        a.put(104, "Pierre");
        a.put(102, "Marie");
        a.put(103, "Jean");
        List<Integer> b = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : a.entrySet()) {
            b.add(entry.getKey());
        }
        b.sort(null);
        for (int i : b) {
            System.out.println(i + " : " + a.get(i) );
        }
    }
}
