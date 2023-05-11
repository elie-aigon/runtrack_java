package Jour03.Job05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Job05 {
    public static void main(String[] args) {
        int[] tableau = {1, 2, 13, 2, 5, 10};
        List<Integer> uniqueVal =  new ArrayList<>();

        for(int i : tableau){
            if(!uniqueVal.contains(i)){
                uniqueVal.add(i);
            }
        }
        System.out.println("Valeurs uniques : " + uniqueVal);
    }
}
