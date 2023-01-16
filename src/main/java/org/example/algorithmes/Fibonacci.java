package org.example.algorithmes;

import java.util.Arrays;

public class Fibonacci {
    public static int a = 44;
    public static void main(String[] args) {
        int n = 10;
        long[] mem = new long[n+1];// for saving the values
        Arrays.fill(mem, -1);
        System.out.println(getNaiveFibonacci(n));
        System.out.println(getUpgradingNaiveFibonnaci(n, mem));
        System.out.println(getEffectiveFibonacci(n));
//        System.out.println(factorial(50));
    }
    public static long factorial(int a){

        return a==1?1 : a*factorial(a-1);
    }

    //slow algo
    //int n = 100 -> 50_000 years
    public static long getNaiveFibonacci(int n) {
       if(n<=1){
           return n;
       }
       return getNaiveFibonacci(n-1)+getNaiveFibonacci(n-2);//O(n)
    }
    public static long getUpgradingNaiveFibonnaci(int n, long[] mem) {
   if(mem[n]!=-1){
       return mem[n];
   }
   if(n<=1){
       return n;
   }
   long result=getUpgradingNaiveFibonnaci(n-1, mem)+getUpgradingNaiveFibonnaci(n-2, mem);
   mem[n]=result;
   return result;
    }

    //more effective algo
    public static long getEffectiveFibonacci(int n) {
        if(n<=1){
            return n;
        }
   long[]arr = new long[n+1];
   arr[0]=0;
   arr[1]=1;
        for (int i = 2; i <= n; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }

}
