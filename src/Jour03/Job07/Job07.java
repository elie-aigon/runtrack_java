package Jour03.Job07;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Job07 {
    public static void main(String[] args) {
        int[][] matrice1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrice2 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        int[][] matriceSum = new int[matrice1.length][matrice1[0].length];
        System.out.println(Arrays.deepToString(matrice1));
        for(int x = 0;  x < matrice1.length ; x++){
            for(int y = 0;  y < matrice1.length ; y++){
                matriceSum[x][y] = matrice1[x][y] +  matrice2[x][y];
            }
        }
        System.out.println(Arrays.deepToString(matriceSum));
    }
}
