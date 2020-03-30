package com.moosedev.practice.codewars;

import java.util.*;

public class SumSquaredDivisors {

    public static String listSquared(long m, long n) {
        List<String> results = new ArrayList<>();
        for (long i = m; i <= n; i++){
            Set<Long> divisors = getDivisors(i);
            long squareSum = divisors.stream().sorted().reduce((a,b) -> a+b*b).get();

            if (isPerfectSquare(squareSum)){
                results.add("[" + i + ", " + squareSum + "]");
            }
        }
        return "[" + results.stream().reduce((a,b) -> a + ", " + b).orElse("") + "]";
    }

    static Set<Long> getDivisors(double number){
        Set<Long> result = new HashSet<>();
        result.add((long) number);
        result.add((long) 1);

        if (number == 1) {
            return result;
        }

        for (long div = 2; div * div <= number; div++){
            double higherDiv = number / div;
            if (isInteger(higherDiv)){
                result.addAll(getDivisors(div));
                result.addAll(getDivisors((long) higherDiv));
            }
        }
        return result;
    }

    private static boolean isPerfectSquare(long number){
        double squareRoot = Math.sqrt(number);
        return isInteger(squareRoot);
    }

    private static boolean isInteger(double number){
        return number == Math.floor(number);
    }
}

