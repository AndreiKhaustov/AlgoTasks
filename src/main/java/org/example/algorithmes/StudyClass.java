package org.example.algorithmes;

import java.util.Arrays;
import java.util.Comparator;

public class StudyClass {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1,4,5,7,9,1222}, 1222));

    }

    public static int binarySearch(int[] arr, int a) {
        int high = arr.length-1;
        int low = 0;
        while(low<=high) {
            int mid = low + (high-low)/2;
            if(a>arr[mid]) {
                low = mid+1;
            }
            else if(a<arr[mid]){
                high = mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

}

