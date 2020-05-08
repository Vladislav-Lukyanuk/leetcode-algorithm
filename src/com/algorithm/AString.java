package com.algorithm;

public class AString {
    public int atoi(String str) {
        if(str == null || str.isEmpty())
            return 0;
        str = str.trim();
        if(str.isEmpty())
            return 0;

        int i = 0;
        double result = 0;
        boolean isNegative = false;
        if(str.charAt(0) == '+') {
            i++;
        }
        if(str.charAt(0) == '-') {
            i++;
            isNegative = true;
        }
        while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            result = result * 10 + (str.charAt(i) - '0');
            i++;
        }
        result = isNegative ? -result : result;
        if (result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        return (int) result;
    }
}
