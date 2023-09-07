package Job7;

public class Job7 {
    int i;

    public static void main(String[] args) {
        e1(3,0);
        e2();
        e3();
    }

    static public void e1(int n1, int n2) {
        try {
            n1 = 2;
            n2 = 0;
            int result = n1 / n2;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    static public void e2 ( ){
        try {
            int[] c = new int[3];
            c[4] = 3;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
    static public void e3 ( ){
        try {
            String  a = null;
            a.length();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }

}
