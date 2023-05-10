package Jour02;

public class Job06 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 0; i <= 100; i++){
            if (i % 2 == 0){
                result += i;
            }
        }
        System.out.println("Somme des nombres paires entre 0 et 100 :" + result);
    }
}
