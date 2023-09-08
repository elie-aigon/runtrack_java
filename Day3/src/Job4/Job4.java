package Job4;

public class Job4 {
    public static void main(String[] args) {
        Boite<String> a = new Boite<String>(); Boite<Integer> b = new Boite<Integer>();
        a.setValue("Hello"); b.setValue(23);
        System.out.println(a.getValue()); System.out.println(b.getValue());
    }
}
