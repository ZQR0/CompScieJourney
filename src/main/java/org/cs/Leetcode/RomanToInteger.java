package org.cs.Leetcode;

import java.util.HashMap;

/*
* @author ZQR0
* @since 17.12.2022
* */
public class RomanToInteger {

    /*
    * @method romanToInt
    * @param String s - inout string
    * @return int result - Integer that equals Roman integers*/
    public int romanToInt(String s) {
        HashMap<Character, Integer> m = new HashMap<Character, Integer>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        char[] chars = s.toCharArray();
        int[] n = new int[chars.length];

        for(int i =0 ;i < n.length; i++) {
            n[i]=m.get(chars[i]);
        }

        int sum = 0;

        for(int i = 0; i<n.length; i++) {
            sum = i ==chars.length - 1 || n[i]>=n[i+1] ? sum+n[i] : sum-n[i];
        }

        return sum;
    }
}
