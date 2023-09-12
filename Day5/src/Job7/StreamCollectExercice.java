package Job7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectExercice {
    public static void main(String[] args) {
        List<String> a =  Arrays.stream(args).filter(x -> Integer.parseInt(x) < Integer.parseInt(args[0])).collect(Collectors.toList());
        for (String x : a){
            System.out.println(x);
        }
    }
}
