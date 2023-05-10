package Jour01.Job09;

public class MyString {
    public static void main(String[] args) {
        String MyString1 = "aaaaa";

        String MyString2 = "aa\u0061aa";

        String MyString3 = "aaa" + "aa";

        String MyString4 = new String("aaaaa");
        System.out.println(MyString1);
        System.out.println(MyString2);
        System.out.println(MyString3);
        System.out.println(MyString4);
    }
}
