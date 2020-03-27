package com.moosedev.practice.codewars;

import java.util.Arrays;

public class MaxSequence {
    public static int sequenceSent(int[] arr) {
        int returnVal = 0;
        for( int i = 0; i < arr.length; i++ ){
            for( int j=arr.length; j>i; j--){
                int[] subArray = Arrays.copyOfRange(arr, i, j);
                int localSum = Arrays.stream(subArray).sum();
                if(localSum > returnVal) {
                    returnVal = localSum;
                }
            }
        }
        return returnVal;
    }

    public static int sequence(int[] arr) {
        int max_ending_here = 0, max_so_far = 0;
        for (int v : arr) {
            max_ending_here = Math.max(0, max_ending_here + v);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        return max_so_far;
    }
}
