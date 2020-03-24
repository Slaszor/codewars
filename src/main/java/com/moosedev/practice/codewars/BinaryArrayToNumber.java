package com.moosedev.practice.codewars;

import java.util.Collections;
import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        Collections.reverse(binary);
        Integer power = 0;
        Integer output = 0;

        for ( Integer i : binary){
            if (i==1) output += (int) Math.pow(2, power);
            power++;
        }
        return output;
    }
}
