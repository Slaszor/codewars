package com.moosedev.practice.codewars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinValidator {
    public static boolean validatePin(String pin) {
        Pattern pattern = Pattern.compile("\\d{4}|\\d{6}");
        Matcher matcher = pattern.matcher(pin);
        return matcher.matches();
    }
}
