package com.moosedev.practice.codewars;

import java.util.Arrays;

public class MaxSequence {
    public static int sequence(int[] arr) {
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
}
