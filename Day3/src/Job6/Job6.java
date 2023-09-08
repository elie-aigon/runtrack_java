package Job6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Job6 {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.addAll(List.of("cat", "ape", "axe", "ant"));
        List<String> b = a.stream().filter(n -> n.startsWith("a") && n.length() == 3).collect(Collectors.toList());
        System.out.println(b);
    }
}
