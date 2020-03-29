package com.moosedev.practice.codewars;

import java.util.*;

public class StockList {
    public static String stockSummarySinglePass(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOf1stLetter.length == 0 || lstOfArt.length == 0)
            return "";

        Iterator<String> keys = Arrays.stream(lstOf1stLetter).sorted().iterator();
        Iterator<String> entries = Arrays.stream(lstOfArt).sorted().iterator();

        Character currentKey = keys.next().charAt(0);
        String currentEntry = entries.next();

        Map<Character, Integer> counters = new HashMap<>();

        while (true){
            if (!counters.containsKey(currentKey)){
                counters.put(currentKey, 0);
            }
            if (currentKey == currentEntry.charAt(0)){
                Integer currentValue = counters.get(currentKey);
                currentValue += Integer.parseInt(currentEntry.split(" ")[1]);
                counters.put(currentKey, currentValue);
                if(!entries.hasNext()){
                    break;
                }
                currentEntry = entries.next();
                continue;
            }

            if (currentKey < currentEntry.charAt(0)){
                if(!keys.hasNext()){
                    break;
                }
                currentKey = keys.next().charAt(0);
            }
            else if (currentKey > currentEntry.charAt(0)){
                if(!entries.hasNext()){
                    break;
                }
                currentEntry = entries.next();
            }
        }
        String result = "";
        for (Character c : counters.keySet()){
            if (result.length() > 0){
                result += " - ";
            }
            result += "(" + c + " : " + counters.get(c) + ")";
        }
        return result;
    }


    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOf1stLetter.length == 0 || lstOfArt.length == 0)
            return "";
        List<String> keys = Arrays.asList(lstOf1stLetter);
        List<String> entries = Arrays.asList(lstOfArt);
        String result = "";
        for (String key : keys){
            Integer counter = 0;
            System.out.println(key);
            for(String entry : entries){
                System.out.println(entry);
                if (entry.startsWith(key)){
                    Integer increment = Integer.parseInt(entry.split(" ")[1]);
                    counter += increment;
                }
            }
            if (result.length() > 0){
                result += " - ";
            }
            result += "(" + key + " : " + counter + ")";
        }
        return result;
    }
}
