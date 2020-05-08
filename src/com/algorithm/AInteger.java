package com.algorithm;

public class AInteger {
    public int reverse(int x) {
        long result = 0;

        while(x != 0) {
            result *= 10;
            result += x % 10;
            x /= 10;
        }

        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) result;
    }
}
