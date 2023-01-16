package org.example.algorithmes;

public class MergeSort extends Fibonacci{
    public int f = MergeSort.a;
    // O(n log n)
    public static void main(String[] args) {
        int[] arr = {8,1,3,5,9,12,33, -1000};
     mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
        }
        System.out.println(new MergeSort().f);
        }
   public static void mergeSort(int[] arr) {
        int currentSize = arr.length;
        if(currentSize==1){
            return;
        }
        int mid = currentSize/2;
        int[] le = new int[mid];
        int[] ri = new int[currentSize-mid];
       for (int i = 0; i < mid; i++) {
           le[i] = arr[i];
       }
       for (int i = mid; i < currentSize; i++) {
           ri[i-mid] = arr[i];
       }
       mergeSort(le);
       mergeSort(ri);
       merge(arr, le, ri);
   }
   public static void merge(int[]arr, int[] le, int[] ri) {
        int leSize = le.length;
        int riSize = ri.length;
        int iCount = 0;
        int jCount = 0;
        int arrCount = 0;
        while(iCount<leSize && jCount<riSize) {
            if(le[iCount]<ri[jCount]) {
                arr[arrCount] = le[iCount];
                iCount++;
                arrCount++;
            }
            else {
                arr[arrCount] = ri[jCount];
                jCount++;
                arrCount++;
            }
        }
       for (int i = iCount; i < leSize; i++) {
           arr[arrCount++] = le[i];
       }

       for (int i = jCount; i < riSize; i++) {
           arr[arrCount++] = ri[i];
       }

   }


}
