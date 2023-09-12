package Job4;

import java.util.function.Predicate;

public class LambdaArgumentExercice {
    public static void main(String[] args) {
        Predicate<String> out = str -> str.length() > Integer.parseInt(args[1]);
        System.out.println(out.test(args[0]));
    }
}
