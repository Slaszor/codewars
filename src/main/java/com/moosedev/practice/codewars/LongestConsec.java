package com.moosedev.practice.codewars;

class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {
        // your code

        String concatResult = "";

        for (int i = 0; i < strarr.length; i++){
            String current = "";
            for (int j = i; j < i + k && j < strarr.length && k <= strarr.length; j++){
                current = current.concat(strarr[j]);
            }
            if (current.length() > concatResult.length()){
                concatResult = current;
            }
        }
        return concatResult;
    }
}
