package org.example.algorithmes;

import java.util.HashMap;
import java.util.Map;

public class TaskFindTheNumberOfMiniStops {

    public static void main(String[] args) {
//    int[] arr = {0, 100, 350, 690, 695, 1000, 1200};
//    int capacity = 400;
//        System.out.println(getStops(arr, capacity));
//        System.out.println(getNumber(arr,capacity));



    }

    public static int getStops(int[] arr, int capacity){
        //O(n)
        int result = 0; //Optimal number of stops
        int currentStop = 0;//current stop
        int nextStop = 0;
        while(nextStop < arr.length-1) {
            while (nextStop < arr.length-1 && arr[nextStop] - arr[currentStop] <= capacity) {
                nextStop++;
            }
            if(arr[nextStop] - arr[nextStop-1]>capacity){
                return -1;
            }
            result++;
            currentStop = nextStop-1;
        }
        return result;
    }






}
