package org.cs.Leetcode;

/*
 * @author ZQR0
 * Solution №2
 * @since 12.12.2022
 * Task: we need to find the length of last word in string
 * @params String s - input string
 * @return int len - length of last word
 */
public class LengthOfLastWord2 {
    public int lengthOfLastWord(String s) {
        int len = 0;
        s = s.trim();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            else {
                len++;
            }
        }

        return len;
    }
}
