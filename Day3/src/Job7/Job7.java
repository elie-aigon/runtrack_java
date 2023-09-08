package Job7;

import java.util.Optional;
import java.util.Scanner;

public class Job7 {
    public static void main(String[] args) {
        Optional<String> x = Optional.ofNullable("aaa");
        Optional<String> y = Optional.ofNullable(null);
        if(x.isPresent()) {
            System.out.println("Len = " + x.get().length());
        } else {
            System.out.println("Chaine non fournie");
        }
        if(y.isPresent()) {
            System.out.println("Len = " + y.get().length());
        } else {
            System.out.println("Chaine non fournie");
        }
    }
}
