import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student blyat = new Student("Blyat", Arrays.asList(10, 10, 10));
        blyat.addGrade(20);
        blyat.higherGrade();
        blyat.lowerGrade();
        blyat.moyenne();
    }
}