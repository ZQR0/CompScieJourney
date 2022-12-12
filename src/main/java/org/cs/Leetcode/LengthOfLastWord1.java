package org.cs.Leetcode;

/*
* @author ZQR0
* Solution №1
* @since 12.12.2022
* Task: we need to find the length of last word in string
* @params String s - input string
* @return int lastLen - length of last word
*/
public class LengthOfLastWord1 {
    public int lengthOfLastWord(String s) {
        int lastLen = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && lastLen > 0) {
                return lastLen;
            } else if (s.charAt(i) != ' ') {
                lastLen++;
            }
        }
        return lastLen;
    }
}
