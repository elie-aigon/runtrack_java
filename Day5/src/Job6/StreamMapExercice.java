package Job6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExercice {
    public static void main(String[] args) {
        List<String> a = Arrays.stream(args).toList().stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(a);
    }
}
