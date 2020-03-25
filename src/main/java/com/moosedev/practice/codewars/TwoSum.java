package com.moosedev.practice.codewars;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        int firstIndex = 0;
        for(int first: numbers){
            int secondIndex = 0;
            for(int second: numbers){
                if (second == target - first) return new int[]{firstIndex, secondIndex};
                secondIndex++;
            }
            firstIndex++;
        }
        return null;
    }
}
