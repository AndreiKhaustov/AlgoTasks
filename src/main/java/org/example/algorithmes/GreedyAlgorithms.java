package org.example.algorithmes;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class GreedyAlgorithms {
    public static void main(String[] args) {
        int[]arr = {1,3,4,9,5,8};
        System.out.println(getMaxNumberFromDigits(arr));
    }
    public static String getMaxNumberFromDigits(int[] arr) {
        return String.join("",Arrays.stream(arr)
                .boxed()
                .sorted(Collections.reverseOrder())
                .map(String::valueOf).toArray(String[]::new));
        //N log N
//        Arrays.sort(arr);
//        StringBuilder d = new StringBuilder();
//        for (int i = arr.length-1; i >= 0; i--) {
//            d.append(arr[i]);
//        }
//        return d.toString();
    }
}
