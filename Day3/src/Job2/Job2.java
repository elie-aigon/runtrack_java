package Job2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Job2 {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.addAll(List.of("chien", "chien", "oiseau", "poisson", "chat", "orc"));
        List<String> output = a.stream().distinct().collect(Collectors.toList());
        System.out.println(output);
    }
}
