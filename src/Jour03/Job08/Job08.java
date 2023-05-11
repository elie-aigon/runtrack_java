package Jour03.Job08;

import java.util.Arrays;

public class Job08 {
    public static void main(String[] args) {
        int[][] tab = {{5, 9, 3}, {7, 2, 8}, {1, 6, 4}};
        int[] tabTemp = new int[tab.length * tab[0].length];

        int index = 0;
        for (int[] x : tab) {
            for (int y = 0; y < x.length; y++) {
                tabTemp[index] = x[y];
                index++;
            }
        }
        index = 0;
        Arrays.sort(tabTemp);
        for (int[] x : tab) {
            for (int y = 0; y < x.length; y++) {
                x[y] = tabTemp[index];
                index++;
            }
        }
        System.out.println(Arrays.deepToString(tab));
    }
}
