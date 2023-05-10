package Jour02;

public class Job12 {
    public static void main(String[] args) {

        int count = 0;
        for (int x = 1; x <= 6; x++) {
            for (int y = 1; y <= 6; y++) {
                for (int z = 1; z <= 6; z++) {
                    System.out.println(x + " : " + y + " : " + z);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

