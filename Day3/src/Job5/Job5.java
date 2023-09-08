package Job5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Job5 {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.addAll(List.of(2, 4, 6, 3, 8));
        List<Integer> b = a.stream().map(n -> n*2).filter(n -> n >10).collect(Collectors.toList());
        System.out.println(b);
    }
}
