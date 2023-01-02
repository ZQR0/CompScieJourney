package org.cs.Leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRoman {
    public String intToRoman(int num) {
        Map<String, Integer> values = new LinkedHashMap<>();
        StringBuilder sb = new StringBuilder();

        values.put("M",1000);
        values.put("CM",900);
        values.put("D",500);
        values.put("CD",400);
        values.put("C",100);
        values.put("XC",90);
        values.put("L",50);
        values.put("XL",40);
        values.put("X",10);
        values.put("IX",9);
        values.put("V",5);
        values.put("IV",4);
        values.put("I",1);

        for (Map.Entry<String, Integer> entry : values.entrySet()) {
            while (num >= entry.getValue()) {
                num = num - entry.getValue();
                sb.append(entry.getKey());
            }
        }

        return sb.toString();
    }
}
